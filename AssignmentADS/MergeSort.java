package SortingPack;

public class MergeSort {
    int length;
    int array[];
    int tempMergeArray[];

public static void main(String args[]) {
  int []inputArr={48,36,13,52,19,21};
     MergeSort ms=new MergeSort();
     ms.sort(inputArr);
    for (int i : inputArr)
    {
        System.out.println(i + "");
    }
}
    public void sort(int inputArr[])
    {
        this.array=inputArr;
        this.length=inputArr.length;
        this.tempMergeArray=new int[length];
        divideArray(0,length-1);
    }

    public void divideArray(int lowerIndex,int higherIndex)
    {
        if(lowerIndex<higherIndex)
        {
            int middleIndex=lowerIndex+(higherIndex-lowerIndex)/2;

            divideArray(lowerIndex,middleIndex);
            divideArray(middleIndex+1,higherIndex);
            mergeArray(lowerIndex,middleIndex,higherIndex);
            }
        }
         public void mergeArray(int lowerIndex,int middleIndex,int higherIndex)
         {
             for(int i=lowerIndex;i<=higherIndex;i++)
             {
                 tempMergeArray[i]=array[i];
             }
             int i=lowerIndex;
             int j=middleIndex+1;
             int k=lowerIndex;
             while (i<=middleIndex && j<=higherIndex)
             {
                 if(tempMergeArray[i]<=tempMergeArray[j]) {
                     array[k] = tempMergeArray[i];
                     i++;
                 }
                 else {
                     array[k] = tempMergeArray[j];
                     j++;
                 }
                 k++;
             }
             while (i<=middleIndex)
             {
                 array[k]=tempMergeArray[i];
                 k++;
                 i++;
             }
         }



    }






