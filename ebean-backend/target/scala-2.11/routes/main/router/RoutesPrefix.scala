
// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:C:/Users/Michael/code/classes/CS4345-SWEPrinciples/Lab-2-Ebean/ebean-backend/conf/routes
// @DATE:Thu Mar 31 19:37:47 CDT 2022
=======
// @SOURCE:C:/Users/Michael/code/classes/CS4345-SWEPrinciples/cs4345-intellic-socialnetwork/ebean-backend/conf/routes
// @DATE:Fri Apr 08 16:05:49 CDT 2022
>>>>>>> yash


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
