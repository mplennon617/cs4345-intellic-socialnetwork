package models;

<<<<<<< HEAD
import com.avaje.ebean.ExpressionList;
=======
>>>>>>> yash
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.Id;
=======
>>>>>>> yash
import java.util.List;

@Entity
public class Follower extends Model {
    private static final long serialVersionUID = 1L;

    @Constraints.Required
<<<<<<< HEAD
    public String followerId;

    @Constraints.Required
    public String userId;

    public static Find<Long, User> find = new Find<Long, User>(){};

    public static User getFollowers(String name) {
        return User.find
                .where()
                .eq("username", name)
                .findUnique();
    }
}
=======
    public long followerID;

    @Constraints.Required
    public long userID;

    public static Find<Long, Follower> find = new Find<Long, Follower>(){};

    public static List<Follower> getFollowers(long id){
        return Follower.find.select("followerID").where().eq("userID", id).findList();
    }
}




>>>>>>> yash
