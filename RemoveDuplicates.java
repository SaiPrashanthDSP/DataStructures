import java.util.Arrays;

// Removing duplicates from sorted array
public class RemoveDuplicates {
    public static void main(String [] args) {
        // 10 10 20 20 30 30 40
        // 10 20 30 40
        System.out.println(removeDuplicates(new int[]{10,10,20,30,30,40}));

    }

    public static int removeDuplicates(int []array) {
        int count = 1;
        for (int i = 1;i< array.length;i++) {
            if(array[i] != array[count-1]) {
                array[count] = array[i];
                count++;
            }

        }
        return count;
    }
}
