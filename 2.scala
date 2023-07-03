import scala.io.StdIn
import scala.util.{Try, Success, Failure}

object NumberProcessing{

    def modulus(number : Int) : Int = {
        number %2
    }

    def isEven(number : Int) : Boolean = {
        modulus(number) == 0

    }

    def negativeOrzero(number :Int) : Boolean =  {
        number <= 0
    }

    def  execute(number : Int) : Unit = number match {

        case n if isEven(n) && negativeOrzero(n) => println("Number you entered is both an even and a Negative/Zero.")
        case n if !(isEven(n)) && negativeOrzero(n) => println("Number you entered is both an odd and a Negative/Zero.")
        case n if isEven(n) => println("Number you entered is an even.")
        case n if !(isEven(n)) => println("Number you entered is an odd.")
        case n if negativeOrzero(n) => println("Number you entered is Negative/Zero")
        
    }

    def exceptionHandling(number :Try[Int]) : Unit = {
        number match {

            case Success(value) => execute(value)
            case Failure(_) => println("Invalid. Please provide a valid integer.")
        }

        
    }

    def main(args: Array[String]): Unit = {
        
        println("Enter an integer:")
        val input = Try(StdIn.readInt())

        exceptionHandling(input)

    }

    


}