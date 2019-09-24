import java.util.*;

/*
        Write a program that will generate ​ exceptions​ of type NegativeArraySizeException,
    IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
    displaying the message stored in the exception object.
 */
class Q8 {
    //to handle the exception in using array and stack array

    public static void checkExceptions(){
        /*Negative Array Size Exception*/
        try{
            int array[] = new int[-2];
        }
        catch (Exception e){
            e.printStackTrace();
        }

        /*ArrayIndexOutOfBounds Exception*/
        try{
            int array[] = new int[1];
            array[0] = 0;
            System.out.println(array[1]);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        /*NullPointerException*/
        try{
            String str = null;
            int len = str.length();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]){

        checkExceptions();
    }
}