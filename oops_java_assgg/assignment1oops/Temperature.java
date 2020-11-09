import java.util.Scanner;
  
class Temperature
{
 public static void main(String args[])
  {
   double fahrenheit;
   float celsius;
    
   Scanner sc = new Scanner(System.in);
  
   System.out.println("Enter temperature in fahrenheit: ");
   fahrenheit = sc.nextDouble();
   
   celsius =(float)((5 * (fahrenheit -32.0)) / 9);

   System.out.println(fahrenheit + "degree Fahrenheit ie equal to" +celsius+ " celsius" );
   }
}