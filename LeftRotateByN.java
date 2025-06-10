import java.util.Arrays;

public class LeftRotateByN {

    public static void main(String [] args) {
        // 10 20 30 40
        // 20 30 40 10

        System.out.println(Arrays.toString(leftRotateByN(new int[]{10,20,30,40},3)));



    }
    private static int[] leftRotateByN(int[] ints,int rotations) {
       int []temp = new int[rotations];
       for (int i = 0; i< rotations;i++) {
           temp[i] = ints[i];
       }
       for (int i = rotations;i<ints.length ;i++) {
           ints[i-rotations] = ints[i];
       }
        for (int i = 0;i<rotations;i++) {
            ints[ints.length - rotations+i] = temp[i];
        }


        return ints;
    }

}
