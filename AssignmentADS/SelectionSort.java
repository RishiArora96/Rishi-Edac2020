package SortingPack;
import java.util.Scanner;
public class SelectionSort {


    void selectionSort(int[] arr,int n)
    {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        }
    }




class SelectionDemo
{
    public static void main(String []args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        SelectionSort sd=new SelectionSort();
        sd.selectionSort(arr,n);
       // System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
