package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.User;
import models.Follower;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;


/**
 * @description: user reg/login
 * @author: Swati Bhat
 * @create: 2019-11-16 15:15
 */

public class UserController extends Controller {

    public Result authenticate() {

        System.out.println("In authenticate");
        JsonNode req = request().body().asJson();
        String username = req.get("username").asText();
        String password = req.get("password").asText();

        try {
            User user = User.findByName(username); // ( match where username and password both match )
            if(user!=null && username.equals(user.username) && password.equals(user.password)){
                return ok("true");
            }else{
                return ok("false");
            }
        }
        catch (Exception e) {
            return ok("false");
        }

    }


    /**
     * When a user register, check if the username is taken
     * save to database if valid
     * POST
     * @return success if valid, fail if already taken
     */
    public Result registerNew() {
        System.out.println("In register");
        JsonNode req = request().body().asJson();
        String username = req.get("username").asText();
        String password = req.get("password").asText();

        User u = User.findByName(username);
        ObjectNode result = null;
        if (u == null) {
            System.out.println("new user");
            result = Json.newObject();
            User user = new User();
            user.username=username;
            user.password=password;
            user.save();
            result.put("body", username);
        }
        return ok(result);
    }

    /**
     * Return list of Followers give user ID
     * GET
     * @return success if valid, fail if already taken
     */
    public Result getFollowers() {
        System.out.println("Follower List");
        JsonNode req = request().body().asJson();
        Long id = req.get("id").asLong();

        ObjectNode result = null;

        List<Follower> list = Follower.getFollowers(id);
        if (list != null) {
            result = Json.newObject();
            int i = 1;
            for (Follower l : list){

                result.put(("ID"+i), l.followerID);
                i++;
            }
        }
        return ok(result);
    }

}
