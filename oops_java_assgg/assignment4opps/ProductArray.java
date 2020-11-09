class ProductArray
{
  public static void main(String args[])
   {
     int a[] = {5,3,4,6,2};
     int b[] = {2,6,5,8,7};
     int c[] = new int[5];
     
     for(int i=0;i<5;i++)
       {
        c[i] = a[i] * b[i];
       } 

      System.out.println("Product of two array elements is: ");
  
      for(int i=0;i<5;i++)
       {
        System.out.println(c[i]);
       } 
     }
}
      
      
     