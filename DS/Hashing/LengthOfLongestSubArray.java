package Hashing;

import java.util.*;


public class LengthOfLongestSubArray {

    public static void main(String [] args) {
        System.out.println(lengthOfLongestSubArray(new int[]{8,9,1,2,3,4,1,5},6));

    }
    static int lengthOfLongestSubArray(int []numbers,int targetSum) {

        int length = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int start = 0;start<numbers.length;start++) {
            sum +=numbers[start];
            if(map.containsKey(sum-targetSum)) {
                length = Math.max(length,start-map.get(sum-targetSum));
            }
            if (!map.containsKey(sum)) {
                map.put(sum,start);
            }
        }
        return length;


    }
    }
