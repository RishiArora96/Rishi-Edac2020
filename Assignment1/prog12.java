import java.util.Scanner;
 
public class prog12 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("enter first number: ");
  int n1 = in.nextInt();
   
  System.out.print("enter second number: ");
  int n2 = in.nextInt();
   
  System.out.print("enter third number: ");
  int n3 = in.nextInt();
   
  System.out.println("Average of three numbers is: " + 
   (n1 + n2 + n3) / 3);
 }
}