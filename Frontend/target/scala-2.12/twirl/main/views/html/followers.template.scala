
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

object followers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(followers: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Play Setup Demo</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Followers</strong>
            </h1>
        </header>


        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <h3 class="focused blue-text text-darken-2">Followers</h3>
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

  def render(followers:String): play.twirl.api.HtmlFormat.Appendable = apply(followers)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (followers) => apply(followers)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-01T21:30:14.692
                  SOURCE: C:/Users/Michael/code/classes/CS4345-SWEPrinciples/Lab-2-Ebean/Frontend/app/views/followers.scala.html
                  HASH: d2f91edac3ad38387cd258b88d8c211a24c2689f
                  MATRIX: 952->1|1066->20|1094->22
                  LINES: 28->1|33->1|34->2
                  -- GENERATED --
              */
          