
// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:C:/Users/Michael/code/classes/CS4345-SWEPrinciples/Lab-2-Ebean/ebean-backend/conf/routes
// @DATE:Thu Mar 31 19:37:47 CDT 2022
=======
// @SOURCE:C:/Users/Michael/code/classes/CS4345-SWEPrinciples/cs4345-intellic-socialnetwork/ebean-backend/conf/routes
// @DATE:Fri Apr 08 16:05:49 CDT 2022
>>>>>>> yash

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
  }

}
