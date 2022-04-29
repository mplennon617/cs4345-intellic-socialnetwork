
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
                    <li><a href="/">Login</a></li>
                    <li><a href="/register">Register</a></li>
                    <li><a href="/followers">Followers</a></li>
                </ul>
            </div>
        </nav>

        <div class="row">
            <div class="card col s8 offset-s2 m4 offset-m4">
                <div class="card-panel">
                    <h4 class="focused blue-text text-darken-2">Login</h4>
                    <form action=""""),_display_(/*34.36*/routes/*34.42*/.HomeController.loginHandler()),format.raw/*34.72*/("""" method="GET">

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
                        """),_display_(/*50.26*/if(authorizeMessage!= null)/*50.53*/{_display_(Seq[Any](format.raw/*50.54*/("""
                            """),format.raw/*51.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*52.30*/authorizeMessage),format.raw/*52.46*/("""
                            """),format.raw/*53.29*/("""</div>
                            <br>
                        """)))}),format.raw/*55.26*/("""
                        """),format.raw/*56.25*/("""<div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>
                        <a href=""""),_display_(/*59.35*/routes/*59.41*/.HomeController.signup()),format.raw/*59.65*/("""">Don't have an account?</a>
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
<<<<<<< HEAD
                  DATE: 2022-04-01T23:40:50.194
                  SOURCE: C:/Users/Michael/code/classes/CS4345-SWEPrinciples/Lab-2-Ebean/Frontend/app/views/login.scala.html
                  HASH: 35dca9e6949486fa9ac000f0cb94ff87b88db485
                  MATRIX: 948->1|1068->28|2656->1591|2671->1597|2722->1627|3477->2355|3513->2382|3552->2383|3609->2412|3712->2488|3749->2504|3806->2533|3902->2598|3955->2623|4183->2824|4198->2830|4243->2854
                  LINES: 28->1|33->2|62->31|62->31|62->31|78->47|78->47|78->47|79->48|80->49|80->49|81->50|83->52|84->53|87->56|87->56|87->56
=======
                  DATE: 2022-04-28T20:28:16.607
                  SOURCE: C:/Users/Michael/code/classes/CS4345-SWEPrinciples/cs4345-intellic-socialnetwork/Frontend/app/views/login.scala.html
                  HASH: 6312671be8546b1d4d7051c629b49f204dc28179
                  MATRIX: 948->1|1069->27|1097->29|2991->1898|3006->1904|3057->1934|3828->2678|3864->2705|3903->2706|3961->2736|4065->2813|4102->2829|4160->2859|4258->2926|4312->2952|4543->3156|4558->3162|4603->3186
                  LINES: 28->1|33->1|34->2|66->34|66->34|66->34|82->50|82->50|82->50|83->51|84->52|84->52|85->53|87->55|88->56|91->59|91->59|91->59
>>>>>>> yash
                  -- GENERATED --
              */
          