
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

"""),format.raw/*38.54*/("""
"""),format.raw/*39.42*/("""
"""),format.raw/*40.103*/("""
"""),format.raw/*41.107*/("""
"""),format.raw/*42.51*/("""
"""),format.raw/*43.37*/("""
"""),format.raw/*44.38*/("""
"""),format.raw/*45.31*/("""
"""),format.raw/*46.29*/("""
"""),format.raw/*47.26*/("""
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
                  DATE: 2022-05-01T18:52:35.374
                  SOURCE: C:/Users/Michael/code/classes/CS4345-SWEPrinciples/cs4345-intellic-socialnetwork/Frontend/app/views/index.scala.html
                  HASH: eaf6abd10bfaada70b4c4caaa8f8224023bc20ca
                  MATRIX: 948->1|1038->25|1105->18|1137->64|3197->2099|3225->2106|3261->2167|3291->2210|3322->2314|3353->2422|3383->2474|3413->2512|3443->2551|3473->2583|3503->2613|3533->2640|3575->2654
                  LINES: 28->1|31->2|34->1|35->3|68->36|68->36|70->38|71->39|72->40|73->41|74->42|75->43|76->44|77->45|78->46|79->47|80->48
                  -- GENERATED --
              */
          