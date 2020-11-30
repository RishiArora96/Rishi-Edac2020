3*package datastructure;
class BubbleSort
{
    public void bubblesort(int arr[])
    {
        int n = arr.length;
        int temp;

        for(int i=0; i < n-1;i++)
        {
            for(int j = 0; j < n-1 ;j++)
            {
                if(arr[j]> arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                        
            }
        }
    } 
    
    public void display(int arr[])
    {
        for(int i=0; i< arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }




    public static void main(String args[])
    {
        BubbleSort s = new BubbleSort();
        int arr[] = {12,43,45,17,32,60};
        s.display(arr);
        System.out.println("Array after Bubble sort");
        s.bubblesort(arr);
        s.display(arr);
    }
   
   
}