package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String []args) {
        System.out.println(Arrays.toString(sortArray(new int[]{10,3,5,1,2})));

    }
    static int[] sortArray(int[] num) {
        int min_index = 0;
        for(int i = 0; i< num.length-1;i++) {
            min_index = i;
            for (int j = i+1;j<num.length;j++) {
                if(num[j] < num[min_index]) {
                    min_index = j;

                }
            }
            int temp = num[i];
            num[i] = num[min_index];
            num[min_index] = temp;


        }
        return num;
    }
}
