// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Michael/code/classes/CS4345-SWEPrinciples/cs4345-intellic-socialnetwork/Frontend/conf/routes
// @DATE:Thu Apr 28 19:54:48 CDT 2022

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_2: controllers.HomeController,
  // @LINE:8
  FollowerController_1: controllers.FollowerController,
  // @LINE:19
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_2: controllers.HomeController,
    // @LINE:8
    FollowerController_1: controllers.FollowerController,
    // @LINE:19
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_2, FollowerController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, FollowerController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """followers""", """controllers.FollowerController.viewFollowers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.loginHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.signupHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """followers/get""", """controllers.FollowerController.followerHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_FollowerController_viewFollowers1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("followers")))
  )
  private[this] lazy val controllers_FollowerController_viewFollowers1_invoker = createInvoker(
    FollowerController_1.viewFollowers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FollowerController",
      "viewFollowers",
      Nil,
      "GET",
      this.prefix + """followers""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_loginHandler2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_loginHandler2_invoker = createInvoker(
    HomeController_2.loginHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "loginHandler",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_signup3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup3_invoker = createInvoker(
    HomeController_2.signup(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Nil,
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_signupHandler4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_signupHandler4_invoker = createInvoker(
    HomeController_2.signupHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signupHandler",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_FollowerController_followerHandler5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("followers/get")))
  )
  private[this] lazy val controllers_FollowerController_followerHandler5_invoker = createInvoker(
    FollowerController_1.followerHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FollowerController",
      "followerHandler",
      Nil,
      "GET",
      this.prefix + """followers/get""",
      """ FIXME: CHANGE TO GETIDFROMUSERNAME WHEN WE GET IT WORKING ON THE BACKEND""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_at6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index())
      }
  
    // @LINE:8
    case controllers_FollowerController_viewFollowers1_route(params@_) =>
      call { 
        controllers_FollowerController_viewFollowers1_invoker.call(FollowerController_1.viewFollowers())
      }
  
    // @LINE:9
    case controllers_HomeController_loginHandler2_route(params@_) =>
      call { 
        controllers_HomeController_loginHandler2_invoker.call(HomeController_2.loginHandler())
      }
  
    // @LINE:11
    case controllers_HomeController_signup3_route(params@_) =>
      call { 
        controllers_HomeController_signup3_invoker.call(HomeController_2.signup())
      }
  
    // @LINE:13
    case controllers_HomeController_signupHandler4_route(params@_) =>
      call { 
        controllers_HomeController_signupHandler4_invoker.call(HomeController_2.signupHandler())
      }
  
    // @LINE:16
    case controllers_FollowerController_followerHandler5_route(params@_) =>
      call { 
        controllers_FollowerController_followerHandler5_invoker.call(FollowerController_1.followerHandler())
      }
  
    // @LINE:19
    case controllers_Assets_at6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at6_invoker.call(Assets_0.at(path, file))
      }
  }
}
