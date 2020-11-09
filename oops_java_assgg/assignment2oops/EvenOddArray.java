import java.util.*;

class EvenOddArray
{
  public static void main(String args[])
  {
    int sum=0,temp=0;
    Scanner sc = new Scanner(System.in);
     
    int a []={2,3,4,6,7,10,13,15,17,18,20};
    
    for(int i=1;i<=a.length;i++)
    {
      a[i] = sc.nextInt();
       
        if(a[i] % 2==0)
         {
           sum = sum + a[i];
          }
         else
          {
           temp = temp + a[i];
           }
         System.out.println("Sum of even elements of array is "+sum);
        
        System.out.println("Sum of odd elements of array "+temp);
      }
    }
}
