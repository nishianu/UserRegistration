import scala.util.matching.Regex
import scala.io.StdIn.readLine
object pincodeValidation 
{
  def main(args: Array[String]):Unit=
  {
    val input = readLine("Enter a username: ")
    val pattern = new Regex("^[A-Z]{1}[A-Za-z]{2,}$")
    if (pattern.matches(input)){
        print("valid pattern.")   
    }
    else{
        print("not a valid pattern.")
    }
  }
}