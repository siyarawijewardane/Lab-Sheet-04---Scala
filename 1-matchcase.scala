object Interest{

    def flatRate(amount : Double) : Double = amount match {

        case _ if 0 < amount && amount <= 20000 => 0.02
        case _ if 20000 < amount && amount <= 200000 => 0.04
        case _ if 200000 < amount && amount <= 2000000 => 0.035
        case _ if amount > 2000000 => 0.065
        case _ if amount <= 0 => throw new Exception("Invalid amount")

    }

    def totalInterest(amount : Double) : Double = {

        amount*flatRate(amount)
    }

    def interest(amount : Double): Unit = {

        try{
            val result = totalInterest(amount)
            println(s"The total interest is $result")
        }
        catch {
            case exception : Exception => println("Error :" + exception.getMessage)
        }
    } 

    def main(args: Array[String]): Unit = {
        
        interest(-300000)
    }
}   