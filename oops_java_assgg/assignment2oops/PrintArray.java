import java.util.*;

class PrintArray
{
  public static void main(String args[])
  {
   int n;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter number of elements :");
   n = sc.nextInt();
   int arr[] = new int[n];

   for(int i=0;i<=n;i++)
   {
     
     arr[i] = sc.nextInt();
     System.out.println("Display the array elements:");
     System.out.println(arr[i]);
    } 
  }
}
