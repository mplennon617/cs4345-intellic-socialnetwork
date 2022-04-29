// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Michael/code/classes/CS4345-SWEPrinciples/cs4345-intellic-socialnetwork/Frontend/conf/routes
// @DATE:Thu Apr 28 20:03:09 CDT 2022


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
