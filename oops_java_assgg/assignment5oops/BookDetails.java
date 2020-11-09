import java.util.*;
 
class Book
{
	int bookid;
	String bookname;
	float price;

        void get()
	{
	   
	   this.bookid = bookid;
	   this.bookname = bookname;
           this.price = price;
        }

	void display()
	{
	   
	   System.out.println("Id = "+this.bookid);
	   System.out.println("Book Name = "+this.bookname);
	   System.out.println("Price = "+this.price);
	}
}

class BookDetails
{

	
	void giveHighestPrice(Book[]  b) 
	{
		double max=b[0].price;
		for(int i=0;i<b.length;i++) 
		{
			if(max<b[i].price)max=b[i].price;
		}	
		
		
		System.out.println("Maximun Price : "+max);
	}
	
	
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
        	System.out.println("no of book detail to be enter");
       		int n=sc.nextInt();
        	Book arr[]=new Book[n];
        
        	for(int i=0;i<n;i++)
	        {
        	System.out.println("Enter "+i+" book id "+i+" book name"+i+" book price");
        	 int id=sc.nextInt();
        	 String name=sc.next();
        	 double price=sc.nextDouble();
        	 
        	 arr[i]=new Book(id,name,price);
        	}

       		 for(int i=0;i<n;i++)
                {
        	System.out.println(arr[i].id);
        	System.out.println(arr[i].name);
        	System.out.println(arr[i].price);
        		
               }		
		
          Books obj=new Books();
          obj.giveHighestPrice(arr);
	}

}