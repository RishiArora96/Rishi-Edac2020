class AddArray
{
 public static void main(String args[])
  { 
    int a[] = {1,4,2,3,6};
    int b[] = {7,8,6,9,5};
    int c[] = new int[5];
  
    for(int i=0;i<5;i++)
     {
      c[i] = a[i] + b[i];
     }
     System.out.println("Addition of array elements is :");

     for(int i=0;i<5;i++)
     {
      System.out.print(c[i]+" ");
     }
   }
}


     