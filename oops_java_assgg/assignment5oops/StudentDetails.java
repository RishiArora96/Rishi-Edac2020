import java.util.Scanner;
 
class Student
{
   static String InstituteName = "CDAC Mumbai";

   String name;
   int rollNo;
   float marks;

   Scanner sc = new Scanner(System.in);

   Student()
     {
       System.out.println("Enter all details of student:");
       rollNo = sc.nextInt();
       name = sc.next();
       marks = sc.nextFloat();
      }

    void printdetails()
     {
       System.out.println("Roll no :"+rollNo);
       System.out.println("Name :"+name);
       System.out.println("Marks :"+marks);  
       System.out.println("Institute name :"+InstituteName);  
       
     }
}


class StudentDetails
{
  public static void main(String args[])
   {
     Student s = new Student();
     s.printdetails();

    }
}



   