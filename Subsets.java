public class Subsets {

   static void printSubsets(String word,String current,int i) {

        if(i==word.length()) {
            System.out.println(current);
            return;
        }
        printSubsets(word,current,i+1);
       printSubsets(word,current+word.charAt(i),i+1);


   }
    public static void main(String []args) {
        printSubsets("abcd","",0);
    }
}
