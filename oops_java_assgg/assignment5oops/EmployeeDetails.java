import java.util.*;
  
class Employee
{  
     int empid;
     String ename;
     String design;

     void accept()
      {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of employee :");
        empid = sc.nextInt();
        ename = sc.next();
        design = sc.next();
      }
  
     void display()
      { 
        System.out.println("Employee ID : "+empid);
        System.out.println("Employee Name : "+ename);
        System.out.println("Designation : "+design);
       }
}

class EmployeeDetails
{
  public static void main(String args[])
   {
     String s = "Manager";
     Employee e[] = new Employee [3];

     for(int i=0;i<3;i++)
      {
        e[i] = new Employee();
        e[i].accept();
       }
    
     for(int i=0;i<3;i++)
      {
        if(e[i].design.equals(s))
         {
           e[i].display();
         }
      }
   }
}
    