// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Michael/code/classes/CS4345-SWEPrinciples/cs4345-intellic-socialnetwork/Frontend/conf/routes
// @DATE:Thu Apr 28 20:03:09 CDT 2022

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def signupHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signupHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:11
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def loginHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.loginHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseFollowerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def followerHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FollowerController.followerHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "followers/get"})
        }
      """
    )
  
    // @LINE:8
    def viewFollowers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FollowerController.viewFollowers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "followers"})
        }
      """
    )
  
  }


}
