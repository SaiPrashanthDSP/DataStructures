package Hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {

    public static void main(String [] args) {
        // 4,-3,2,1

        System.out.println(printSubArrayWithZeroSum(new int[]{1,2,-3,5}));
    }

    static boolean printSubArrayWithZeroSum(int []numbers) {
        Set<Integer> set = new HashSet<Integer>();
        int sum = 0;
        for(int number: numbers) {
            sum = sum+number;
            if(set.contains(sum)) {
                return true;
            }
            if(sum == 0) return  true;

            set.add(sum);
        }
        return false;
    }

    }
