
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/sinha/Documents/Spring2022/CS4345/cs4345-intellic-socialnetwork/ebean-backend/conf/routes
// @DATE:Fri Apr 01 23:26:22 CDT 2022


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
