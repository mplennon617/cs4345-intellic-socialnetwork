// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/sinha/Documents/Spring2022/CS4345/cs4345-intellic-socialnetwork/Frontend/conf/routes
// @DATE:Fri Apr 01 18:45:41 CDT 2022


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
