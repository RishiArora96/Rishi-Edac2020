class Expression
{
 public static void main(String args[])
  {
    int x=10,y,z;
     
     y= x*x + 3*x -7;
     System.out.println(y);

     y= x++ + ++x;
     System.out.println(x);
     System.out.println(y);

     z= x++ - --y - --x + x++;
     System.out.println(x);
     System.out.println(y);
     System.out.println(z);
     
    display();
    }

    static void display()
    {
     boolean x=true;
     boolean y=false;
     boolean z;

     z= x && y || !(x||y);
     System.out.println(z);
    }
}
     
