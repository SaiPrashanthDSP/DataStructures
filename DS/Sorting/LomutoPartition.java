package Sorting;

import java.util.Arrays;

public class LomutoPartition {

    public static void main(String[] args) {

        int []array = {2,3,1,5,6,1};
        System.out.println(Arrays.toString(arrayPartition(array)));

    }

    static int[] arrayPartition(int[] arr) {
        int start = -1;
        int lastIndex = arr.length-1;
        int pivot = arr[arr.length-1];
        for(int i = 0; i< lastIndex;i++) {
            if(arr[i] <= pivot) {
                start++;
                int temp = arr[start];

                arr[start] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[start+1];
        arr[start+1] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        return arr;
    }

    }
