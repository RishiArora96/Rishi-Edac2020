import java.util.*;

class Series
{
  public static void main(String args[])
  {
   int i,sum =0;
   int n=102;
   
   for(i=12;i<=102;i+=10)
    {
      System.out.print(i);

       if(i<102)   
    
         System.out.print("+");
         sum = sum +i;
         
      } 
     System.out.println();
    System.out.println("Series is :"+sum);
  }
}