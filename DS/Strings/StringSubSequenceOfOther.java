package Strings;

public class StringSubSequenceOfOther {

    static boolean stringSubsequenceOfOther(String str1, String str2) {
        int i = 0 ,j = 0;
        while(i<str1.length() && j< str2.length()) {
            if(str1.charAt(i) == str2.charAt(j)) {
                i++;j++;
            } else {
                i++;
            }
        }
//        for(int i = 0; i< str2.length();i++) {
//
//        }
        return (j == str2.length());
    }

    static boolean stringSubSeqRecursively(String str1, String str2, int ptr1, int ptr2) {
        if(ptr2 == str2.length()) {
            return true;
        }
        if(ptr1 >= str1.length() || ptr2 >= str2.length() ) {
            return false;
        }
        if(str1.charAt(ptr1) == str2.charAt(ptr2)) {
            ptr1++;ptr2++;
        } else {
            ptr1++;
        }
        return stringSubSeqRecursively(str1,str2,ptr1,ptr2);


    }

    public static void main(String [] args) {
        String s1 = "SaiPrashanth";
        String s2 = "Sais";
        PrintData.printData(stringSubsequenceOfOther(s1,s2));
        PrintData.printData(stringSubSeqRecursively(s1,s2,0,0));

    }
}
