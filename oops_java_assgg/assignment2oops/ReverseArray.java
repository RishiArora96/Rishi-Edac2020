import java.util.Scanner;
 
class ReverseArray
{
  public static void main(String args[])
  {
    int i;
    int arr [] =new int[] { 14,28,50,36,20,16 };

    System.out.println("Display the array elements");
   
    for(i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]+" ");
    }
    
    System.out.println();
    System.out.println("Array in reverse order :");

    for(i=arr.length-1;i>=0;i--)
    { 
     System.out.println(arr[i]+" ");
    }
  }
}