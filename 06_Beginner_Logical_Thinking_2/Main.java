
// execution starts from main method only.
// To print anything on the console we have "System.out.println()" statement
// Main is a Class
// public is a Access Modifier/Specifier
// String args[] is an array of Strings and it used for Command Line Input
// System --> It's am Class and ClassName should begin with a Capital Letter

class Main{
    public static void main(String[] args){

        System.out.println("Hello..");  // println() --> breaks the Line
        System.out.print("World");
        System.out.println("Shantanu");
        
        // "Hello", "World", "Shantanu" are Strings 
        // String is an Sequence of Characters

//=======================================================================================

        System.out.println(123); // Number -> Integer
        System.out.println(123.56); // Number -> Double
        System.out.println(123.54f); // Number -> Float

//=======================================================================================

        // In this case (operator is Same But, Type of Data is Different)
        System.out.println(156 + 7); // Result is in Integer i.e - (163)
        // Addition of two Integers
        System.out.println("156" + "7"); // Result is in String i.e - (1567)
        // Join two Strings (Concatenation)

//=======================================================================================

        System.out.println("156" + 7); // (String + Integer) = Result is in String i.e - (1567)
        // Behind print function ("156" + "7") --> "1567"
        // Implicit Typecasting -- It converts an Integer to the String & it happens Behind the print()
        System.out.println("Hello" + 5); // Result is in String i.e (Hello5)        
    }
}



