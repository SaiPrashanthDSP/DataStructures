package Strings;

public class LeftMostRepetitiveCharacter {

    static int leftMostRepetitiveCharacter(String str) {

        int []count = new int[256];
        for(int i = 0; i< str.length();i++) {
            count[str.charAt(i)]++;
        }
        for(int i =0;i< str.length();i++) {
            if(count[str.charAt(i)] > 1) {
                return i;
            }
        }
return -1;
    }
    public static void main(String []args) {
        String s1 = "geeks";
        PrintData.printData(leftMostRepetitiveCharacter(s1));
    }
}
