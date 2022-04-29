package controllers;

import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import views.html.*;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

/**
 * Software Service Market Place
 */
public class FollowerController extends Controller {

    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;

    @Inject
    public FollowerController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    /**
     * Followers Page
     */
    public Result viewFollowers() {
        return ok(views.html.followers.render(null,""));
    }

    public CompletionStage<Result> followerHandler() {

        Form<User> followerForm = formFactory.form(User.class).bindFromRequest();
        if (followerForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.login.render(""));  // send parameter like register so that user could know
        }

        return followerForm.get().gatherFollowers()
            .thenApplyAsync((WSResponse r) -> {
                if (r.getStatus() == 200 && r.asJson() != null && r.asJson().asBoolean()) {

                    //
                    System.out.println(r.asJson());
                    // add username to session
                    session("username",followerForm.get().getUsername());   // store username in session for your project
                    // redirect to index page, to display all categories
                    return ok(views.html.followers.render(followerForm.get().getFollowers().toString(), ""));
                } else {
                    System.out.println("response null");
                    String authorizeMessage = "Incorrect Username or Password ";
                    return badRequest(views.html.login.render(authorizeMessage));
                }
            }, ec.current());
    }
}