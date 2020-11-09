import java.util.Scanner;

class SI
{ 
 public static void main(String args[])
  {
   float p,n,r,Simple_Interest;
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Principle amount: ");
    p =sc.nextFloat();
    
    System.out.println("Enter the Rate of intrest: ");
    r =sc.nextFloat();

    System.out.println("Enter the Time period: ");
    n =sc.nextFloat();
    
    Simple_Interest = (p*n*r)/100;

    System.out.println("Simple Interest is "+Simple_Interest);
   }
}
   