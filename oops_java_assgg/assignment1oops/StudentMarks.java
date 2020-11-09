import java.util.*;

class StudentMarks
{
 public static void main(String args[])
  {
   int english,maths,physics,chemistry,computers;
   float sum,percentage;

   Scanner sc = new Scanner(System.in);

   System.out.println("Enter the marks of five subjects:");
   english = sc.nextInt();
   maths = sc.nextInt();
   physics = sc.nextInt();
   chemistry = sc.nextInt();
   computers = sc.nextInt();

   sum = english + maths + physics + chemistry + computers;
   percentage = (sum/500)*100;

   System.out.println("Total Sum of marks is: "+sum);
   System.out.println("Percentage is: "+percentage+" %");
   }
}