package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String [] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{10,3,5,1,2})));
    }

    public static int[] sortArray(int []num) {
        for (int i = 0; i< num.length-1;i++) {
            for (int j = 0; j< num.length-i-1;j++) {
                if(num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
            }
        return num;
    }
}
