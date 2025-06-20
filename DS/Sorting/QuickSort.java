package Sorting;

public class QuickSort {

    static void quickSort(int[] arr,int low, int high) {
        if(low < high) {
            int partition = arrayPartition(arr,low,high);
            quickSort(arr,low,partition);
            quickSort(arr,partition+1,high);

        }

    }
    static int arrayPartition(int[] arr , int low , int high) {

        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i > j) return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        int []array = {2,3,1,5,6,1};
        quickSort(array,0,array.length-1);
        for(int i : array) {
            System.out.println(i);
        }
    }

    }
