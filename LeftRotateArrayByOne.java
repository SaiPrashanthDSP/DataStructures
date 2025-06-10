import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void main(String [] args) {
        // 10 20 30 40
        // 20 30 40 10

        System.out.println(Arrays.toString(leftRotateByOne(new int[]{10,20,30,40})));



    }

    private static int[] leftRotateByOne(int[] ints) {
        int ele = ints[0];
        for (int i =1;i< ints.length;i++) {
            ints[i-1] = ints[i];

            if(i == ints.length - 1) {
                ints[i] = ele;
            }
        }
        return ints;
    }
}
