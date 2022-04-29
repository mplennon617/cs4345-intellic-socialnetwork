// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Michael/code/classes/CS4345-SWEPrinciples/cs4345-intellic-socialnetwork/Frontend/conf/routes
// @DATE:Thu Apr 28 20:03:09 CDT 2022

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def signupHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:11
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def loginHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:8
  class ReverseFollowerController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def followerHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "followers/get")
    }
  
    // @LINE:8
    def viewFollowers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "followers")
    }
  
  }


}
