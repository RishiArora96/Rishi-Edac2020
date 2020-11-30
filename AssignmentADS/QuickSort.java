package SortingPack;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {50, 48, 35, 24, 12, 34, 56};
        int length = arr.length;
        QuickSort q = new QuickSort();

        q.quickSortRecursion(arr, 0, length - 1);
        q.printArray(arr);

    }

    int partition(int[] arr, int lowerIndex, int higherIndex) {
        int pivote = arr[(lowerIndex + higherIndex) / 2];

        while (lowerIndex <= higherIndex) {

            while ((arr[lowerIndex] < pivote)) {
                lowerIndex++;
            }
            while (arr[higherIndex] > pivote) {
                higherIndex--;
            }
            if (lowerIndex <= higherIndex) {
                int temp = arr[lowerIndex];
                arr[lowerIndex] = arr[higherIndex];
                arr[higherIndex] = temp;

                lowerIndex++;
                higherIndex--;
            }

        }
        return lowerIndex;

        //return pivote;
    }

    void quickSortRecursion(int[] arr, int lowerIndex, int higherIndex) {
        int pi = partition(arr, lowerIndex, higherIndex);
        if (lowerIndex < pi - 1) {
            quickSortRecursion(arr, lowerIndex, pi - 1);
        }
        if (pi < higherIndex) {
            quickSortRecursion(arr, pi, higherIndex);
        }
    }

    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}