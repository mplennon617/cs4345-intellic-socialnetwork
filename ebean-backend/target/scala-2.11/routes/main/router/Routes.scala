
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Michael/code/classes/CS4345-SWEPrinciples/cs4345-intellic-socialnetwork/ebean-backend/conf/routes
// @DATE:Fri Apr 08 16:05:49 CDT 2022

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  UserController_1: controllers.UserController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    UserController_1: controllers.UserController
  ) = this(errorHandler, HomeController_0, UserController_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, UserController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """followers""", """controllers.UserController.getFollowers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """id_from_username""", """controllers.UserController.getIDFromUsername()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.authenticate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.UserController.registerNew()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_getFollowers1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("followers")))
  )
  private[this] lazy val controllers_UserController_getFollowers1_invoker = createInvoker(
    UserController_1.getFollowers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getFollowers",
      Nil,
      "GET",
      """ View Followers {"id":id }""",
      this.prefix + """followers"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_getIDFromUsername2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("id_from_username")))
  )
  private[this] lazy val controllers_UserController_getIDFromUsername2_invoker = createInvoker(
    UserController_1.getIDFromUsername(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getIDFromUsername",
      Nil,
      "GET",
      """ View Followers {"id":id }""",
      this.prefix + """id_from_username"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_authenticate3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_authenticate3_invoker = createInvoker(
    UserController_1.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "authenticate",
      Nil,
      "POST",
      """Login""",
      this.prefix + """login"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UserController_registerNew4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_UserController_registerNew4_invoker = createInvoker(
    UserController_1.registerNew(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "registerNew",
      Nil,
      "POST",
      """ Add User  {"username":name, "password":password}""",
      this.prefix + """signup"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_UserController_getFollowers1_route(params) =>
      call { 
        controllers_UserController_getFollowers1_invoker.call(UserController_1.getFollowers())
      }
  
    // @LINE:12
    case controllers_UserController_getIDFromUsername2_route(params) =>
      call { 
        controllers_UserController_getIDFromUsername2_invoker.call(UserController_1.getIDFromUsername())
      }
  
    // @LINE:16
    case controllers_UserController_authenticate3_route(params) =>
      call { 
        controllers_UserController_authenticate3_invoker.call(UserController_1.authenticate())
      }
  
    // @LINE:20
    case controllers_UserController_registerNew4_route(params) =>
      call { 
        controllers_UserController_registerNew4_invoker.call(UserController_1.registerNew())
      }
  }
}
