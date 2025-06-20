package Sorting;

import java.util.Arrays;

public class HoarePartition {

    public static void main(String[] args) {

        int []array = {2,3,1,5,6,1};

       int partition = arrayPartition(array);
       System.out.println(partition);
        for(int i : array) {
            System.out.println(i);
        }
    }

    static int arrayPartition(int[] arr) {
        int low = -1;
        int high = arr.length;
        int pivot = arr[0];
        while (true) {
            do {
                low++;
            } while (arr[low] < pivot);
            do {
                high--;
            } while (arr[high] > pivot);
            if (low > high) return high;
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
        }
    }
}
