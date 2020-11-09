import java.util.*;

class SearchArray
{
  public static void main(String args[])
  {
   int n,i, num,flag=0;
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter number of elements :");
   n = sc.nextInt();
   int a [] = new int[n];

   System.out.println("Enter all the elements: ");

   for(int i=0;i<=n;i++)
   { 
     a [i] = sc.nextInt();
    } 

    System.out.println("Enter the element you want to search: ");
    num = sc.nextInt();

    for(int i=0;i<=a.length;i++)
    {
      if(a [i] == num)
          {
           flag = 1;
           break;
          }
       else
          {
           flag = 0;
           }
     }

      if(flag == 1)
       {
          System.out.println("Element found at position:" +(i+1));
       }
      else   
       {
          System.out.println("Element not found");
        }

  }
}
