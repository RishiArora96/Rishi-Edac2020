//package datastructure;

import java.util.*;
class Sortings {
    /*Bubble sort*/
    void BubbleSort(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /*Selection Sort*/
    void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    /*Insertion Sort*/
    void InsertionSort(int arr[]) {
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;

            while ((i > -1) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }

    /*Merge Sort*/
    void sort(int arr[], int beg, int mid, int end) {

        int l = mid - beg + 1;      //length of left half
        int r = end - mid;          //length of right half

        int LeftArray[] = new int[l];
        int RightArray[] = new int[r];

        for (int i = 0; i < l; ++i)
            LeftArray[i] = arr[beg + i];

        for (int j = 0; j < r; ++j)
            RightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = beg;
        while (i < l && j < r) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            } else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < l) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }
        while (j < r) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }


    void MergeSort(int arr[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            /*Sorting two halves recursively*/
            MergeSort(arr, beg, mid);
            MergeSort(arr, mid + 1, end);
            sort(arr, beg, mid, end);
        }
    }

        void QuickSort(int[] arr, int left, int right)
            {
                int index = partition(arr, left,right);

                if(left < index - 1)
             {
                QuickSort(arr, left, index - 1);
            }
            if(index < right)
            {
                QuickSort(arr, index, right);
            }
        }
        int partition(int[] arr, int left, int right)
        {
            int pivot = arr[(left + right)/2];
            while (left <= right)
            {
                while (arr[left] < pivot)
                    left++;
                while (arr[right] > pivot)
                right--;

                if (left <= right)
                {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }
            }
        return left;
        }

    /*To print output*/
    void display(int arr[])
    {
        //System.out.println("-------------------------------------------------------AFTER SORTING OF MARKS--------------------------------------------------");

        System.out.println("=======================================================================================================================================");
        System.out.println("Sorted Marks Are As Below:");

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("#########->Lowest Score is: " + arr[0]);
        System.out.println("#########->Highest Score is: " + arr[arr.length - 1]);
        System.out.println("#########->Our Class Champion's Score is: " + arr[arr.length - 1]);
        System.out.println();
        System.out.println("=======================================================================================================================================");

    }
}

public class SortingMain extends Sortings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        SortingMain srt = new SortingMain();
        System.out.println("***************************************************************************************************************************************");
        System.out.println("*****************************************************WELCOME TO SENIOR SECONDARY SCHOOL************************************************");
        System.out.println("***************************************************************************************************************************************");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("###################--------------------There Are Total 12 Classes In This School As Shown Below--------------------####################");

        System.out.println();
        System.out.println("FOR CLASS 1ST---- ENTER DIGIT 1");
        System.out.println("FOR CLASS 2ND---- ENTER DIGIT 2");
        System.out.println("FOR CLASS 3RD---- ENTER DIGIT 3");
        System.out.println("FOR CLASS 4TH---- ENTER DIGIT 4");
        System.out.println("FOR CLASS 5TH---- ENTER DIGIT 5");
        System.out.println("FOR CLASS 6TH---- ENTER DIGIT 6");
        System.out.println("FOR CLASS 7TH---- ENTER DIGIT 7");
        System.out.println("FOR CLASS 8TH---- ENTER DIGIT 8");
        System.out.println("FOR CLASS 9TH---- ENTER DIGIT 9");
        System.out.println("FOR CLASS 10TH--- ENTER DIGIT 10");
        System.out.println("FOR CLASS 11TH--- ENTER DIGIT 11");
        System.out.println("FOR CLASS 12TH--- ENTER DIGIT 12");
        System.out.println();
        System.out.println("==>Please Enter The Class Number Digit To Get Students Marks Details Of That Class.......");

        int cl = sc.nextInt();

        System.out.println();
        System.out.println("=======================================================================================================================================");
        System.out.println();
        System.out.println("#########################----------------------------------WELCOME TO CLASS " + cl + "---------------------------------#########################");
        System.out.println();
        System.out.println("You Are Currently In Class " + cl + ".....");
        System.out.println();
        System.out.println("==>Please Enter The Number Of Students In Class " + cl + " To Input Their Marks.......");

        int n = sc.nextInt();

        System.out.println("==>Please Enter The Marks Of " + n + " Students Of Class " + cl + "........");

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("##############------------------Marks Of Class " + cl + " Is Shown Below Of All Students In Unsorted Order-------------------################");


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int c = 1;
        while (c != 0) {
            System.out.println("\n\n=======================================================================================================================================");

            System.out.println("==>Choose Sorting Algorithm For Getting All Student Marks As Well As Lowest Marks,Highest Marks And Class Champion Marks In Sorting Form");
            System.out.println("1. BUBBLE SORT");
            System.out.println("2. SELECTION SORT");
            System.out.println("3. INSERTION SORT");
            System.out.println("4. MERGE SORT");
            System.out.println("5. QUICK SORT");
            System.out.println("0. EXIT");
            System.out.println("==>Enter Your Choice As Digit.....");
            System.out.println("=======================================================================================================================================");

            c = sc.nextInt();

            switch (c) {
                case 1:
                    srt.BubbleSort(arr);
                    System.out.println("                                 *********************IMPLEMENTING BUBBLE SORT***********************");
                    srt.display(arr);
                    break;
                case 2:
                    srt.SelectionSort(arr);
                    System.out.println("                                 *********************IMPLEMENTING SELECTION SORT***********************");
                    srt.display(arr);
                    break;
                case 3:
                    srt.InsertionSort(arr);
                    System.out.println("                                 *********************IMPLEMENTING INSERTION SORT***********************");
                    srt.display(arr);
                    break;
                case 4:
                    srt.MergeSort(arr, 0, n - 1);
                    System.out.println("                                  *********************IMPLEMENTING MERGE SORT***********************");
                    srt.display(arr);
                    break;
                case 5:
                    srt.QuickSort(arr, 0, n - 1);
                    System.out.println("                                  *********************IMPLEMENTING QUICK SORT***********************");
                    srt.display(arr);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Enter a valid Choice");
            }
        }
    }
}


