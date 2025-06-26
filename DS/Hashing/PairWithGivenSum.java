package Hashing;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {

    public static void main(String [] args) {
        int numbers[] = {1,4,2,3,7};
        int targetSum = 1;
        System.out.println(isPairExist(targetSum,numbers));
    }

    static boolean isPairExist(int targetSum, int []numbers) {
        // here we can use two pointer approach by sorting the array
        Set<Integer> set = new HashSet<Integer>();
        for(int number: numbers) {
            if(set.contains(targetSum-number)) {
                return true;
            } else {
                set.add(number);
            }
        }
        return false;
    }
}
