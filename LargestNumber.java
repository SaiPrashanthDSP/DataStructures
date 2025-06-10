public class LargestNumber {

    public static void main(String [] args) {
      int[] numbers = new int[]{1,4,7,6,2};
      System.out.println(largestNumberIndex(numbers));
    }

    static int largestNumberIndex(int[] numbers) {
        int largestIndex = 0;
        for(int i = 0; i< numbers.length; i++) {
           if (numbers[i] >= numbers[largestIndex])
                    largestIndex = i;

        }
        return largestIndex;
    }
}
