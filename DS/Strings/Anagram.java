package Strings;

import java.util.TreeMap;

public class Anagram {

    static boolean areAnagrams(String s1, String s2) {
        int[] count = new int[256];
        if(s1.length() != s2.length()) return false;
        for(int i = 0; i< s1.length();i++) {
            count[s1.charAt(i)]++;
        }

        for(int i = 0; i< s2.length();i++) {
            count[s2.charAt(i)]--;
        }
        for (int j : count) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String []args) {
        String str1 = "listen";
        String str2 = "silens";
        PrintData.printData(areAnagrams(str1,str2));
    }
}
