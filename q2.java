import java.util.*;
import java.lang.*;

class Q2
{
  public static void op()
  {
    System.out.println("Enter the number of rows: ");

    Scanner sc = new Scanner(System.in);

    int m= sc.nextInt();

    System.out.println("Enter the number of columns: ");

    int n= sc.nextInt();

    int first[][] = new int[m][n]; 

    int i,j;

    System.out.println("Enter the elements of the first matrix: "); 
    for (i = 0; i < m; i++) 
      for (j = 0; j < n; j++) 
        first[i][j] = sc.nextInt();

    int second[][] = new int[m][n];

    int third[][] = new int[m][n]; 

    System.out.println("Enter the elements of the second matrix: "); 
    for (i = 0; i < m; i++) 
      for (j = 0; j < n; j++)
      { 
        second[i][j] = sc.nextInt();
        third[i][j] = first[i][j]+second[i][j];
      }

    for (i = 0; i < m; i++)
    { 
      for (j = 0; j < n; j++) 
        System.out.print(third[i][j]+" ");
      System.out.println();
    }

 
  }
}