package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import views.html.*;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Software Service Market Place
 */
public class HomeController extends Controller {

    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    /**
     * Index page
     */
    public Result loginPage() {
        return ok(views.html.login.render(""));
    }

    /**
     * Register page
     */
    public Result signup() {
        return ok(views.html.register.render(null));
    }

    public CompletionStage<Result> loginHandler() {

        Form<User> loginForm = formFactory.form(User.class).bindFromRequest();
        if (loginForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.login.render(""));  // send parameter like register so that user could know
        }

        return loginForm.get().checkAuthorized()
            .thenApplyAsync((WSResponse r) -> {
                if (r.getStatus() == 200 && r.asJson() != null && r.asJson().asBoolean() && loginForm.get().getUsername() != null) {

                    System.out.println(r.asJson());
                    // add username to session
                    session("username", loginForm.get().getUsername());   // store username in session for your project
                    // redirect to index page, to display all categories
                    if (loginForm.get().getFollowers() != null) {
                        return ok(views.html.followers.render( loginForm.get().getFollowers().toString(),"Welcome " +  loginForm.get().getUsername())+"!");
                    }
                    else {
                        return ok(views.html.followers.render(null,"Welcome " +  loginForm.get().getUsername()+"!"));
                    }
                } else {
                    System.out.println("response null");
                    String authorizeMessage = "Incorrect Username or Password ";
                    return badRequest(views.html.login.render(authorizeMessage));
                }
            }, ec.current());
    }

    public CompletionStage<Result> signupHandler() {

        Form<User> registrationForm = formFactory.form(User.class).bindFromRequest();
        if (registrationForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.register.render(null));
        }

        return registrationForm.get().registerUser()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        System.out.println("success");
                        System.out.println(r.asJson());
                        return ok(login.render(""));
                    } else {
                        System.out.println("response null");
                        return badRequest(views.html.register.render("Username already exists"));
                    }
                }, ec.current());

    }
}