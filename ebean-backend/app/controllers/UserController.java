package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.User;
import models.Follower;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
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
        long uuid = Long.parseLong(req.get("uuid").asText());

        try {
            User user = User.findByUniqueID(uuid); // ( match where username and password both match )
            if(user!=null && username.equals(user.username) && password.equals(user.password) && uuid == user.uuid){
                return ok("true");
            }else{
                return ok("false");
            }
        }
        catch (Exception e) {
            System.out.println("Authenticate: -- "+e.getMessage());
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
        long uuid = Long.parseLong(req.get("uuid").asText());

        System.out.println(username+"-"+password+"-"+uuid);

        User u = User.findByUniqueID(uuid);
        ObjectNode result = null;
        if (u == null) {
            System.out.println("new user");
            result = Json.newObject();
            User user = new User();
            user.username=username;
            user.password=password;
            user.uuid=uuid;
            user.save(); // CREATE A BEAN TO PLACE INTO DATABASE
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
        long id = Long.parseLong(request().getQueryString("userID"));

        ObjectNode result = null;

        List<Follower> list = Follower.getFollowers(id);
        if (list != null) {
            result = Json.newObject();
            int i = 1;
            for (Follower l : list){
                User temp = User.findByID(l.followerID);
                result.put(("user"+i), temp.username);
                i++;
            }
        }
        return ok(result);
    }


    /**
     * Given this user's username, fetch the user's ID from the database.
     * Used for gatherFollowers() functions on the frontend.
     * GET
     * @return success if valid, fail if already taken
     */
    public Result getIDFromUsername() {
        System.out.println("Get ID From Username");

        String username = request().getQueryString("username");

        User u = User.findByName(username); // ( match where username matches )
        ObjectNode result = null;

        try {
            if(u!=null){
                result = Json.newObject();
                result.put("body",u.id);

                return ok(result);
            }else{
                // ERROR HANDLING
                System.out.println("This username does not exist!");
                return ok("false");
            }
        }
        catch (Exception e) {
            return ok("false");
        }
    }

    /**
     * Return list of Users
     * Get
     * @return success if valid, fail if already taken
     */
    public Result getNewFollowerList() {
        System.out.println("Follower List");
        long id = Long.parseLong(request().getQueryString("userID"));

        ObjectNode result = null;

        List<Follower> followerList = Follower.getFollowers(id);
        List<User> userList = User.getUsers();

        List<String> usernameList = new ArrayList<String>();
        for (User u : userList)
            for (Follower f: followerList)
                if (u.uuid != f.userID && u.id != id)
                    usernameList.add(u.username);


        if (usernameList != null) {
            result = Json.newObject();
            int i = 1;
            for (String s : usernameList){
                result.put(("user"+i), s);
                i++;
            }
        }
        return ok(result);
    }


    /**
     * Return list of Followers give user ID
     * POST
     * @return success if valid, fail if already taken
     */
    public Result addFollower() {
        System.out.println("Add Follower");

        long userid = Long.parseLong(request().getQueryString("userID"));

        String followerIDString = request().getQueryString("followerID");
        long followerid = 0;
        if (followerIDString != null) {
            followerid = Long.parseLong(followerIDString);
        }

        ObjectNode result = null;

        if (followerid != 0) {
            result = Json.newObject();
            int i = 1;
            Follower follower = new Follower();
            follower.followerID = followerid;
            follower.userID = userid;
            follower.save(); // CREATE A BEAN TO PLACE INTO DATABASE
            result.put(("followerid"), followerid);
        }
        return ok(result);
    }


        /**
         * Return list of Followers give user ID
         * POST
         * @return success if valid, fail if already taken
         */
        public Result removeFollower() {
            // System.out.println("Follower List");
            // long id = Long.parseLong(request().getQueryString("userID"));
            //
            ObjectNode result = null;
            //
            // List<Follower> list = Follower.getFollowers(id);
            // if (list != null) {
            //     result = Json.newObject();
            //     int i = 1;
            //     for (Follower l : list){
            //         User temp = User.findByID(l.followerID);
            //         result.put(("user"+i), temp.username);
            //         i++;
            //     }
            // }
            return ok(result);
        }

}
