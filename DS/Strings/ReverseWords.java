package Strings;

public class ReverseWords {

    static char[] reverseWords(char[] s1) {
        int start = 0;
        for(int i = 0; i< s1.length;i++) {
            if(s1[i] == ' '){
                reverse(s1,start,i-1);
                start = i+1;
            }
        }
        reverse(s1,start,s1.length-1);
        reverse(s1,0,s1.length-1);
        return s1;
    }
    static  void reverse(char [] str,int start,int end ) {
        String result = "";
        while(start < end) {
            char temp = str[end];
            str[end] = str[start];
            str[start] = temp;
            start++;
            end--;

        }

    }

    public static void main(String []args) {
      String str = "Sai Prashanth";
      PrintData.printData(new String(reverseWords(str.toCharArray())));
    }
}
