import scala.slick.driver.MySQLDriver.simple._
import Database.threadLocalSession

object Contacts extends Table[(String,Option[Int],Option[String])]("contacts") {
    	def name = column[String]("name", O.PrimaryKey) // This is the primary key column
    	def phone = column[Int]("phone", O.Nullable)
    	def email = column[String]("email", O.Nullable)
    	// Every table needs a * projection with the same type as the table's type parameter
    	def * = name ~ phone.? ~ email.?
}