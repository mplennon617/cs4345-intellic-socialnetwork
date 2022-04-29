
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

object followers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(followers: String, message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""
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
                    <h4 class="focused blue-text text-darken-2">Followers</h4>
                    <p>"""),_display_(/*34.25*/followers),format.raw/*34.34*/("""</p>
                    <ul class="collection">
                        <li class="collection-item avatar">
                            <i class="material-icons circle blue">JD</i>
                            <span class="title">Jane Doe</span>
                                <!--<a href="#!" class="secondary-content"><i class="material-icons">grade</i></a>-->
                        </li>
                        <li class="collection-item avatar">
                            <i class="material-icons circle blue">JS</i>
                            <span class="title">John Smith</span>
                                <!--<a href="#!" class="secondary-content"><i class="material-icons">grade</i></a>-->
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(followers:String,message:String): play.twirl.api.HtmlFormat.Appendable = apply(followers,message)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (followers,message) => apply(followers,message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-28T20:35:52.472
                  SOURCE: C:/Users/Michael/code/classes/CS4345-SWEPrinciples/cs4345-intellic-socialnetwork/Frontend/app/views/followers.scala.html
                  HASH: 2aa82fc340533636ffd27bc16280eba979a1ed00
                  MATRIX: 959->1|1090->37|1118->39|3005->1901|3035->1910
                  LINES: 28->1|33->1|34->2|66->34|66->34
                  -- GENERATED --
              */
          