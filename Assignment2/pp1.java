
public class pp1{

  public static void main(String[] args)
{
   int i,j,n,s,x;
   
   n=9;

   s=n+4-1;
    for(i=1;i<=n;i++)
   {
   for(x=s;x!=0;x--)
    {
   System.out.print(" ");
    }
    for(j=1;j<=i;j++)
    {
     System.out.print(i+" ");
     }
	System.out.println();
    s--;
   }
}
}
