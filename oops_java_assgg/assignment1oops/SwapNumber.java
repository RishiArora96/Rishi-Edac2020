import java.util.*;

class SwapNumber
{
 public static void main(String args[])
 {

  int a,b;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter any two number:");
  a = sc.nextInt();
  b = sc.nextInt();
  
  a = a + b;
  b = a - b;
  a = a - b;

  System.out.println("After swapping " + "a = " +a + "b = "+b);
  }
}