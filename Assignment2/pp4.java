import java.util.Scanner;
public class pp4
{
public static void main(String[] args)
{
int n=9;

for(int i=1; i<=n; i++)
{

for(int j=0; j<n-i; j++)
{
System.out.print(" ");
System.out.print(" ");
}
for(int k=1; k<i; k++)
{
System.out.print(k);
System.out.print(" ");
}
for(int m=i;m>=1;m--)
{
System.out.print(m);
System.out.print(" ");
}
System.out.print("\n");

}
        } 
}