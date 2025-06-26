package Hashing;

import java.util.*;

public class SubArrayWithGivenSum {

    public static void main(String [] args) {
        System.out.println(isSubArrayWithGivenSumExist(new int[]{1,2,-3,5,3},8));

    }

    static boolean isSubArrayWithGivenSumExist(int []numbers,int targetSum) {
        Set<Integer> set = new HashSet<Integer>();
        int sum = 0;
        for(int number: numbers) {
            sum = sum+number;
            if(set.contains(sum-targetSum) || sum == targetSum) {
                return true;
            }
            if(number==targetSum) return true;
            set.add(sum-targetSum);
        }
        return false;
    }

    }
