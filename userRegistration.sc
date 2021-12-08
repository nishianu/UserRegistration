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
    val mobile = readLine("Enter a valid mobile number: ")
    val pattern2 = new Regex("^\\d{1,3}[ ]{1}\\d{10}$")
    val password = readLine("Enter a valid password: ")
    val pattern3 = new Regex("^[A-Z]{1,}[A-Za-z0-9]{8,}$")
    

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
    if (pattern2.matches(mobile)){
        print("\nvalid mobile number")   
    }
    else{
        print("\nnot a valid mobile number.")
    }
    if (pattern3.matches(password)){
        print("\nvalid password")   
    }
    else{
        print("\nnot a valid password.")
    }
  }
}