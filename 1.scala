object Interest{

    def flatRate(amount : Double) : Double = {

        if( 0 < amount && amount <= 20000){
            0.02
        }
        else if(20000 < amount && amount <= 200000){
            0.04
        }
        else if(200000 < amount && amount <= 2000000){
            0.035
        }
        else if(amount > 2000000){
            0.065
        }
        else{
            throw new Exception("Invalid amount")
        }
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
        
        interest(300000)
    }
}   