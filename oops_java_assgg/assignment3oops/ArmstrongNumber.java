/* Armstrong numbersthe are the positive numbers whisch is equal to sum of the cube of the digits of that number.
  the numbers are 0, 1, 153, 370, 371, 407 etc.*/

class ArmstrongNumber
{
  public static void main(String args[])
   {
     int number = 153;
     int rem,result = 0;
     
     while(number>0)
     {
      rem = number % 10;
      result += Math.pow(rem,3);
      number = number/10;
      }
    
      if(result == number)
        System.out.println("The number is armstrong number");
      else
        System.out.println("The number is not armstrong number");
      }
 }
     
   
     