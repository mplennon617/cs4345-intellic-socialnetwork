package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Follower extends Model {
    private static final long serialVersionUID = 1L;

    @Constraints.Required
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
