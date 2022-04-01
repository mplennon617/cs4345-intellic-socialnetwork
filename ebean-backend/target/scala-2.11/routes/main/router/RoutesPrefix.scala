
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Michael/Downloads/Lab-2-Ebean/Lab-2-Ebean/ebean-backend/conf/routes
// @DATE:Tue Mar 29 22:44:36 CDT 2022


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
