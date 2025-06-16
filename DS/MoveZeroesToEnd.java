import java.util.Arrays;

public class MoveZeroesToEnd {

    public static void main(String [] args) {
        // 10 5 0 0 8 0 9 0

        System.out.println(Arrays.toString(moveZeroesToEnd(new int[]{10, 5, 0, 0, 8, 0, 9, 0})));



    }

    public static int[] moveZeroesToEnd(int []array) {
        int pointer = 0;
        for(int i=0; i<array.length;i++) {
            if(array[i] != 0) {
                int temp = array[i];
                array[i] = array[pointer];
                array[pointer] = temp;
                pointer++;
            }
        }
        return array;
    }
}
