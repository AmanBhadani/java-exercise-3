import java.util.*;

/*
        Create a class with a main( ) that throws an object of class Exception inside a try block.
    a. Give the constructor for Exception a ​ String​ argument.
    b. Catch the exception inside a catch clause and print the ​ String​ argument.
    c. Add a finally clause and print a message to prove you were there.
 */


class Q7{

    public void HandleStringException(){ //To handle the string exception
        String str = "this is a constructor string";
        System.out.println(str);
    }

    public static void main(String args[]) throws Exception{
        try{
            throw new Exception(); // to throw an exception
        }
        catch(Exception e){
            e.printStackTrace(); //to print the program's actual error
        }
        finally {
            System.out.println("This is a finally string"); // finally statement
        }
    }
}
