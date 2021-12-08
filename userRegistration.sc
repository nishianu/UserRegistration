import scala.util.matching.Regex
import scala.io.StdIn.readLine
object userRegistration 
{
  def main(args: Array[String]):Unit=
  {
    val username = readLine("Enter a valid username: ")
    val pattern = new Regex("^[A-Z]{1}[A-Za-z]{2,}[ ]{1}[A-Z]{1}[A-Za-z]{2,}$")
    val email = readLine("Enter a valid email: ")
    val pattern1 = new Regex("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")

    if (pattern.matches(username)){
        print("\nvalid username.")   
    }
    else{
        print("\nnot a valid username.")
    }
    if (pattern1.matches(email)){
        print("\nvalid email")   
    }
    else{
        print("\nnot a valid email.")
    }
  }
}