import java.util.*;

class Employee
{
 public static void main(String args[])
  {
    float basic_salary;
    float HRA,DA;
    float Gross_salary;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Basic salary ");
    basic_salary =sc.nextFloat(); 

    if(basic_salary < 10000)
    {
     HRA =(10*basic_salary)/100;
     DA =(90*basic_salary)/100;
     } 
 
     else
     {
      HRA = 2000;
      DA = (98*basic_salary)/100;
      }

      Gross_salary = basic_salary + DA + HRA;
      System.out.println("Gross Salary is "+Gross_salary);
    }
}
      