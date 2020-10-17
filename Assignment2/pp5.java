import java.util.Scanner;
class pp5
{
public static void main(String[] args)
{

int n=9;

for(int i=n;i>=1;i--)
{
    for(int j=i;j>1;j--)
    {
    System.out.print(" "+" ");
    }
    
    for(int k=i;k<=n;k++)
    {
    System.out.print(k+" ");
    }
    for(int m=n-1;m>=i;m--)
    {
    System.out.print(m+" ");
    }
System.out.println(" ");
}
}
}