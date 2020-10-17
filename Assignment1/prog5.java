import java.util.Scanner;
 
public class prog5 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("enter first number: ");
  int a = in.nextInt();
   
  System.out.print("enter second number: ");
  int b = in.nextInt();
   
  System.out.println(a + " x " + b + " = " + a * b);
 }
 
}