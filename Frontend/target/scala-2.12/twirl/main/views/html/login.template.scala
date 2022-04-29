
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>
    <body>

        <nav>
            <div class="nav-wrapper">
                <a href="#" class="brand-logo">Scientist Social Network</a>
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a href="/login">Login</a></li>
                    <li><a href="/register">Register</a></li>
                    <li><a href="/followers">Followers</a></li>
                </ul>
            </div>
        </nav>

        <div class="row">
            <div class="card col s8 m4 offset-m4">
                <div class="card-panel">
                    <form action=""""),_display_(/*33.36*/routes/*33.42*/.HomeController.loginHandler()),format.raw/*33.72*/("""" method="GET">

                        <div class="row">
                            <div class="input-field col s12">

                                <input id="username" name="username" type="text" class="validate">
                                <label for="username">Username</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="password" name="password" type="password" class="validate">
                                <label for="password">Password</label>
                            </div>
                        </div>
                        """),_display_(/*49.26*/if(authorizeMessage!= null)/*49.53*/{_display_(Seq[Any](format.raw/*49.54*/("""
                            """),format.raw/*50.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*51.30*/authorizeMessage),format.raw/*51.46*/("""
                            """),format.raw/*52.29*/("""</div>
                            <br>
                        """)))}),format.raw/*54.26*/("""
                        """),format.raw/*55.25*/("""<div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>
                        <a href=""""),_display_(/*58.35*/routes/*58.41*/.HomeController.signup()),format.raw/*58.65*/("""">Don't have an account?</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(authorizeMessage:String): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage) => apply(authorizeMessage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-28T19:56:29.323
                  SOURCE: C:/Users/Michael/code/classes/CS4345-SWEPrinciples/cs4345-intellic-socialnetwork/Frontend/app/views/login.scala.html
                  HASH: 2d2d1fdaab8b2db81b3931fc31803f3a8b6f104b
                  MATRIX: 948->1|1069->27|1097->29|2910->1817|2925->1823|2976->1853|3747->2597|3783->2624|3822->2625|3880->2655|3984->2732|4021->2748|4079->2778|4177->2845|4231->2871|4462->3075|4477->3081|4522->3105
                  LINES: 28->1|33->1|34->2|65->33|65->33|65->33|81->49|81->49|81->49|82->50|83->51|83->51|84->52|86->54|87->55|90->58|90->58|90->58
                  -- GENERATED --
              */
          