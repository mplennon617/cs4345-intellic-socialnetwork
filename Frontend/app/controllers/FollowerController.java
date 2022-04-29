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
        return ok(views.html.followers.render(null));
    }

    public CompletionStage<Result> followerHandler() {

        // TODO: THIS IS FOR FORM SUBMISSION. IT'S ONLY USED FOR POST REQUESTS
        // WE CANNOT USE A FORM FOR THIS

        User user = new User();

        return user.gatherFollowers()
                .thenApplyAsync((WSResponse r) -> {
                    System.out.println(r.asJson());
                    JsonNode followerJson = r.asJson();
                    if (r.getStatus() == 200) {

                        List<String> followerNames = new ArrayList<String>();
                        for (int i = 0; i < followerJson.size(); i++) {
                            followerNames.add(followerJson.get("user"+(i+1)).asText());
                        }

                        return ok(views.html.followers.render(followerNames.toString()));
                    } else {
                        System.out.println("response null");
                        String authorizeMessage = "Incorrect Username or Password ";
                        return badRequest(views.html.login.render(authorizeMessage));
                    }
                }, ec.current());
    }
}
