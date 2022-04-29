package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Follower extends Model {
    private static final long serialVersionUID = 1L;

    @Constraints.Required
    public long followerID;

    @Constraints.Required
    public long userID;

    public static Find<Long, Follower> find = new Find<Long, Follower>(){};

    public static List<Follower> getFollowers(long id){
        return Follower.find.select("followerID").where().eq("userID", id).findList();
    }
}




