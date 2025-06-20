package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String []args) {
        int[] arr = new int[]{1,3,4,2,0,2,4,5};


     mergeSort(arr,0,7);
     for (int i = 0; i < arr.length;i++) {
         System.out.println(arr[i]);
     }
    }

    public static void mergeSort(int []arr,int left, int right) {

        if(left < right) {
            int mid = left + (right-left)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            mergeFunction(arr,left,mid,right);
        }


    }
    // 10 20 30 5
    // 3 2 4 1

    public static void mergeFunction(int []arr, int left, int middle, int right) {
        int size1 = middle-left+1;
        int size2 = right-middle;
        int [] leftArray = new int[size1];
        int [] rightArray = new int[size2];
        int k = left;

        for (int i = 0;i<size1;i++) {
            leftArray[i] = arr[left + i];
        }
        for (int i = 0; i< size2;i++) {
            rightArray[i] = arr[middle+i+1];
        }
        int i = 0;
        int j = 0;
        while(i< size1 && j < size2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
                k++;
            } else {
                arr[k] = rightArray[j];
                j++;
                k++;
            }
        }

        while (i< leftArray.length) {
            arr[k] = leftArray[i];
            i++;k++;
        }
            while (j< rightArray.length) {
                arr[k] = rightArray[j];
                j++;k++;
            }


    }
}
