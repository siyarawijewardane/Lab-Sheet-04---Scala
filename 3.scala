object StringProcessing{
    
    def toUpper(string : String) : String = {
        string.toUpperCase()
    }

    def toLower(string : String) : String = {
        string.toLowerCase()
    }

    def firstTwoUpper(string : String) : String = {
        val len = string.length
        
        if(len < 2){
            " "
        }
        else{
            if(len == 2){
                
                toUpper(string)
            }
            else{
                toUpper(string.substring(0,2))+toLower(string.substring(2,len))
    
            }

        }
    }

    def firstandLastToUpper(string : String) : String ={
        val len = string.length
        
        if(len < 2 ){
            " "
        }
        else{
            if(len == 2){
                toUpper(string)
            }
            else{
                toUpper(string.substring(0,1))+toLower(string.substring(1,len-1))+toUpper(string.substring(len-1,len))
            }
        }


    }

    def formatNames(name : String , modifier : (String) => String) : String = {
        
        val modifiedName = modifier(name)
        modifiedName
    }

    

    def main(args: Array[String]): Unit = {

        println(formatNames("Benny",toUpper(_)))
        println(formatNames("Niroshan",firstTwoUpper(_)))
        println(formatNames("Saman",toLower(_)))
        println(formatNames("Kumara",firstandLastToUpper(_)))

        
    }
}