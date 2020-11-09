import java.util.*;
 
class PrimeNumber
{
  public static void main(String args[])
  {
     int num;
     boolean flag=true;

     Scanner sc = new Scanner(System.in); 
     System.out.println("Enter any number  ");
     num = sc.nextInt();
     sc.close();

     for(int i=2;i<=num/2;i++)
     {
   
       if(num % i==0)
       {
        flag=false;
        break;
       }
     }

     if(flag)
         System.out.println(num+ " is Prime number");
     else
          System.out.println(num+ "is not Prime number");
    }
}
      

      