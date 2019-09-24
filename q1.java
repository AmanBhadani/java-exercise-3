import java.util.*;
import java.lang.*;

class Q1
{
  public static void op()
  {
    System.out.println("Enter the number of Student: ");

    Scanner sc = new Scanner(System.in);

    int numOfStudents = sc.nextInt();

    int stuGrades[]= new int[numOfStudents];


    for(int i=0;i<numOfStudents;i++)
    {
      System.out.println("Enter the marks of Student"+i+": ");
      stuGrades[i]=sc.nextInt();
      try{
        if(!(stuGrades[i]>=0&&stuGrades[i]<=100))
          throw new Exception("Error");
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
  }
}