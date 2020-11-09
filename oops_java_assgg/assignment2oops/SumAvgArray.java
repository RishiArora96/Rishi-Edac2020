import java.util.*;

class SumAvgArray
{
  public static void main(String args[])
  {
   int n,sum=0;
   float average;
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter no. of elements you want in array:");
   n = sc.nextInt();

   System.out.println("Enter all the elements:");
   int arr [] = new int[n];
  
   for(int i=1;i<n;i++)
   {
     arr [i] = sc.nextInt();
     sum = sum + arr [i];
   }
   System.out.println("Sum is "+sum);
   
   average = sum/n;
   System.out.println("Average is "+average);
  }
}