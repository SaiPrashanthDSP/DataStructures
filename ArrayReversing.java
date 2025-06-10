import java.util.Arrays;

public class ArrayReversing {

    public static void main(String [] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 4, 6})));

    }
    public static int[] reverseArray(int []arr) {
        int start = 0;
        int end = arr.length -1;
        int temp = 0;
        while(start <= end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;

        }
        return arr;
    }
}
