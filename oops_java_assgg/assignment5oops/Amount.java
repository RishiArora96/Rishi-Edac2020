import java.util.Scanner;

class SimpleInterest
{
     static double rate;

     double principle;
     double SI;
     int time;
   
     Scanner sc = new Scanner(System.in);

     void Getdata()
       {
          System.out.println("Enter the values of all parameters: ");
          principle = sc.nextDouble();
          time = sc.nextInt();
          rate = sc.nextDouble();
        }

      void Display()
        {
          SI = (principle * time *rate)/100; 
          System.out.println("Simple Interest = "+SI);
        }

  }

class Amount
{
  public static void main(String args[])  
   {
     SimpleInterest si1 = new SimpleInterest();
     si1.Getdata();
     si1.Display();

     SimpleInterest si2 = new SimpleInterest();
     si2.Getdata();
     si2.Display();
   }
}
      
          