
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

                <h4>"""),_display_(/*33.22*/message),format.raw/*33.29*/("""</h4>

                        <!--<a href="#!" class="secondary-content"><i class="material-icons">grade</i></a>-->

                <!-- Tabs -- View/Find -->
                <div class="col s12">
                    <ul class="tabs">
                        <li class="tab col s6" id="view-follower-tab" for="view">
                            <a href="#view-follower">View</a>
                        </li>
                        <li class="tab col s6" id="find-follower-tab" for="find">
                            <a href="#find-follower">Find</a>
                        </li>
                    </ul>

                    <!-- View -- View Followers -->
                    <div class="card-panel" id="view-follower">

                        <button id="api-search-button" class="btn" type="submit">
                            <a class="white-text" href=""""),_display_(/*52.58*/routes/*52.64*/.FollowerController.getFollowers()),format.raw/*52.98*/("""">
                                Get Followers
                            </a>
                        </button>

                        <h4 class="focused blue-text text-darken-2">Following</h4>
                        <p>"""),_display_(/*58.29*/followers),format.raw/*58.38*/("""</p>
                        <ul class="collection">
"""),format.raw/*60.93*/("""
"""),format.raw/*61.34*/("""
                            """),format.raw/*62.29*/("""<li class="collection-item avatar">
                                <i class="material-icons circle blue">JD</i>
                                <span class="title">Jane Doe</span>
                                <button id="api-search-button" class="btn right" type="submit">Unfollow</button>
                                    <!--<a href="#!" class="secondary-content"><i class="material-icons">grade</i></a>-->
                            </li>
                            <li class="collection-item avatar">
                                <i class="material-icons circle blue">JS</i>
                                <span class="title">John Smith</span>
                                <button id="api-search-button" class="btn right" type="submit">Unfollow</button>
                                    <!--<a href="#!" class="secondary-content"><i class="material-icons">grade</i></a>-->
                            </li>
                        </ul>
                    </div>

                    <!-- View -- Find Followers -->
                    <div class="card-panel" id="find-follower">
                        <h4 class="focused blue-text text-darken-2">Find Followers</h4>
                        <p>"""),_display_(/*80.29*/followers),format.raw/*80.38*/("""</p>
                        <ul class="collection">
                            <li class="collection-item avatar">
                                <i class="material-icons circle blue">FW</i>
                                <span class="title">Freddy Wang</span>
                                <button id="api-search-button" class="btn right" type="submit">Follow</button>
                                    <!--<a href="#!" class="secondary-content"><i class="material-icons">grade</i></a>-->
                            </li>
                            <li class="collection-item avatar">
                                <i class="material-icons circle blue">KW</i>
                                <span class="title">Kirk Watson</span>
                                <button id="api-search-button" class="btn right" type="submit">Follow</button>
                                    <!--<a href="#!" class="secondary-content"><i class="material-icons">grade</i></a>-->
                            </li>
                            <li class="collection-item avatar">
                                <i class="material-icons circle blue">YS</i>
                                <span class="title">Yash Sinha</span>
                                <button id="api-search-button" class="btn right" type="submit">Follow</button>
                                    <!--<a href="#!" class="secondary-content"><i class="material-icons">grade</i></a>-->
                            </li>
                        </ul>
                    </div>

                </div>
            </div>
        </div>

        <!-- Tabs Script -- Inline for now -->
        <script>
            var tabs = document.querySelectorAll('.tabs')
            for (var i = 0; i < tabs.length; i++)"""),format.raw/*110.50*/("""{"""),format.raw/*110.51*/("""
                """),format.raw/*111.17*/("""M.Tabs.init(tabs[i]);
            """),format.raw/*112.13*/("""}"""),format.raw/*112.14*/("""
        """),format.raw/*113.9*/("""</script>

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
                  DATE: 2022-05-02T12:08:25.543
                  SOURCE: C:/Users/Michael/code/classes/CS4345-SWEPrinciples/cs4345-intellic-socialnetwork/Frontend/app/views/followers.scala.html
                  HASH: 894c71c8083ecac8bf4dcbde92b88e6b6580c37e
                  MATRIX: 959->1|1090->37|1118->39|2886->1782|2914->1789|3828->2676|3843->2682|3898->2716|4159->2950|4189->2959|4272->3106|4302->3141|4360->3171|5625->4409|5655->4418|7490->6224|7520->6225|7567->6243|7631->6278|7661->6279|7699->6289
                  LINES: 28->1|33->1|34->2|65->33|65->33|84->52|84->52|84->52|90->58|90->58|92->60|93->61|94->62|112->80|112->80|142->110|142->110|143->111|144->112|144->112|145->113
                  -- GENERATED --
              */
          