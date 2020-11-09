import java.util.*;

class ReverseArray
{
  public static void main(String args[])
  {
    
    int i,j,n,temp=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of elements: ");
    n = sc.nextInt();
 
    System.out.println("Enter the all elements of array: ");
    int a[] = new int[n];

    for(i=0;i<a.length;i++)
     {
       a[i] = sc.nextInt();
       System.out.println(a[i]+" ");
     }

      System.out.println("Reverse of an array element ");
      
      for(j=a.length-1;j>=0;j--)
      {
        System.out.println(a[j]+" ");
      }
    }
}