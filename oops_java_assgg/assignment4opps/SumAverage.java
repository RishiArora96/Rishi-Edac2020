import java.util.*;

class SumAverage
{
  public static void main(String arg[])
   {
    int i,n,sum =0;
    double average;

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the no. of elements: ");
     n = sc.nextInt();

     System.out.println("Enter all the elements: ");
     int a [] = new int[n];
    
     for(i=0;i<a.length;i++)
      {  
        a [i] = sc.nextInt();
        sum = sum + a[i];
       }
       System.out.println("Sum is "+sum);
    
       average = sum/a.length;
       System.out.println("Average is "+average);
     }
}
       
     