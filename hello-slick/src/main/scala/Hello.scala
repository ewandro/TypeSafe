//import scala.slick.driver.H2Driver.simple._
import scala.slick.driver.MySQLDriver.simple._ 
import Database.threadLocalSession

object Hello extends App {
  //Database.forURL("jdbc:h2:mem:test1", driver = "org.h2.Driver") withSession {
   Database.forURL("jdbc:mysql://localhost/test", driver = "com.mysql.jdbc.Driver") withSession {

   val q1 = Query(Contacts).filter(_.name === "Ewandro")
  
 
  println(q1)
  }
}
