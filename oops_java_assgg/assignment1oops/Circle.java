import java.util.Scanner;

class Circle
{ 

 public static void main(String args[])
 {
  double radius;
  double area;
  double circumference;
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter the radius:");
  radius = sc.nextDouble();
   
  area = Math.PI*radius*radius;
  circumference = 2*Math.PI*radius;

  System.out.println("Area of circle is "+area);
  System.out.println("Circumference of circle is "+circumference);

  }
}