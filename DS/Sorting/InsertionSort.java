package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String []args) {
        System.out.println(Arrays.toString(sortArray(new int[]{10,3,5,1,2})));

    }
    // Hint : Half Sorted and Half unsorted

    private static int[] sortArray(int[] num) {
        for (int i = 1;i<num.length;i++) {
            int key = num[i];
            int j = i-1;
            while(j>= 0 && key < num[j]) {

                num[j+1] = num[j];;
                j--;

            }
            num[j+1] = key;
        }
        return num;
    }
}
