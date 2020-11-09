import java.util.Scanner;
class Primeno
{
public static void main(String args[])
{
System.out.println("Enter a no");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int i;
for(i=2;i<n;i++)

if(n%i==0)
break;

if(i==n)
System.out.println("Number is prime");

else
System.out.println("Number is not prime");


}
}
