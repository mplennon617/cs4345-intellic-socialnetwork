package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;

import java.util.List;

public class User {

    private String username;

    private String password;

    private List<Long> followers;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) { this.password = password; }

    public List<Long> getFollowers() { return followers; }

    public void setFollowers(List<Long> password) {
        this.followers = followers;
    }

    public CompletionStage<WSResponse> gatherFollowers() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        //get followers data
        WSRequest request = ws.url("http://localhost:9005/followers");
        ObjectNode res = Json.newObject();

        int i = 1;
        for (Long currId : this.followers) {
            res.put("follower-"+i, currId);
            i++;
        }

        return request.addHeader("Content-Type", "application/json")
                .get()
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

    public CompletionStage<WSResponse> checkAuthorized() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        //add username password
        WSRequest request = ws.url("http://localhost:9005/login");
        ObjectNode res = Json.newObject();
        res.put("username", this.username);
        res.put("password",this.password);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }



    public  CompletionStage<WSResponse> registerUser() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        // send this. user
        ObjectNode res = Json.newObject();
        res.put("username", this.username);
        res.put("password",this.password);

        System.out.println(username);
        System.out.println(password);

        WSRequest request = ws.url("http://localhost:9005/signup");
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

}
