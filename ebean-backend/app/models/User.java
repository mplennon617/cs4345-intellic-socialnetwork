package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class User extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @Constraints.Required
    public String username;

    @Constraints.Required
    public String password;

    @Constraints.Required
    public long uuid;

    public static Find<Long, User> find = new Find<Long, User>(){};

    public static User findByID(long name) {
        return User.find
                .where()
                .eq("id", name)
                .findUnique();
    }

    public static User findByName(String name) {
        return User.find
                .where()
                .eq("username", name)
                .findUnique();
    }

    public static List<User> getUsers() {
      // TODO Check if it works
          return User.findList();
    }
}
