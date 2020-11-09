

class AsceOrderArray
{
	public static void main(String []args)
	{
		int arr1[]={5,14,35,90,139};
		int arr2[]={88,67,35,14,-12};
		int arr3[]={65,14,129,34,7};
		//int i=0;
		int arr4[]=new int [10];

		for(int i=0;i<arr1.length-1;i++)
		{
    
			for(int j=0;i<arr1.length-1;j++)
    			{
      			  if(arr1[i]<arr1[j])
       			   {
    				System.out.println("Ascending");
			   }
			}
		}

		for(int i=0;i<arr2.length-1;i++)
		{	
			for(int j=0;i<arr1.length-1;j++)
			{
			  if(arr2[i]>arr2[j])
			   {
				System.out.println("Descending");

			   }
  		       }
		}
		for(int i=0;i<arr3.length;i++)
		{
    			for(int j=0;i<arr1.length;j++)
    			{
			if(arr3[i]>arr3[j])
			{
   				 System.out.println("ascending");
			}
			else
			{
				System.out.println("Random");

			}
    		}
	}

}
    
