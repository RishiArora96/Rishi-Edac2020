import java.util.Scanner;
 
class Student
{
   static String InstituteName = "CDAC Mumbai";

   String name;
   int rollNo;
   double marks;

   Student(int rn, String n,double m)
     {
       rollNo = rn;
       name = n;
       marks = m;
      }

    void printdetails()
     {
       System.out.println("Roll no :"+rollNo);
       System.out.println("Name :"+name);
       System.out.println("Marks :"+marks);
       System.out.println(Student.InstituteName); 
     }

 public static void main(String args[])
  {

   Student s1 = new Student(10,"Roshani",79.90);
  
   s1.printdetails();

  
   Student s2 = new Student(11,"Radha",75.5);
  
   s2.printdetails();
 }
}