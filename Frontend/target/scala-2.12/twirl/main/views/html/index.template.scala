
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.6*/import java.math.BigInteger;var i = 0


Seq[Any](format.raw/*1.19*/("""
    """),format.raw/*3.1*/("""<!DOCTYPE html>

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
            <header class="topbar container">
                <h1 class="focused" style="font-size: 37px;
                    color: #57a957">
                    <strong>Login Message</strong>
                </h1>
                <p class="focused" style="font-size: 20px;
                    color: #3F51B5">"""),_display_(/*36.38*/message),format.raw/*36.45*/("""</p>

                """),_display_(/*38.18*/if(message.contains("Welcome"))/*38.49*/{_display_(Seq[Any](format.raw/*38.50*/("""
                    """),format.raw/*39.21*/("""<div class="row">
                        <button id="api-search-button" class="btn col s4 offset-s4" type="submit">
                            <a class="white-text" href=""""),_display_(/*41.58*/routes/*41.64*/.FollowerController.followerHandler()),format.raw/*41.101*/("""">
                                VIEW FOLLOWERS
                            </a>
                        </button>
                    </div>
                    <br>
                    """)))}),format.raw/*47.22*/("""
            """),format.raw/*48.13*/("""</header>

        </body>
    </html>
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-28T22:48:09.992
                  SOURCE: C:/Users/Michael/code/classes/CS4345-SWEPrinciples/cs4345-intellic-socialnetwork/Frontend/app/views/index.scala.html
                  HASH: 3beb0ee0ae53f143ae283b1e38502a249e8da318
                  MATRIX: 948->1|1038->25|1105->18|1137->64|3197->2099|3225->2106|3277->2131|3317->2162|3356->2163|3406->2185|3609->2361|3624->2367|3683->2404|3910->2600|3952->2614
                  LINES: 28->1|31->2|34->1|35->3|68->36|68->36|70->38|70->38|70->38|71->39|73->41|73->41|73->41|79->47|80->48
                  -- GENERATED --
              */
          