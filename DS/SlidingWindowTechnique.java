public class SlidingWindowTechnique {

    public static void main(String [] args) {
        System.out.println(findMaxSum(new int[]{10,5,-2,20,2},3));
    }

    public static int findMaxSum(int [] arr,int count) {
        int maxSum = 0;
        for (int i = 0;i<count;i++) {

            maxSum = maxSum+arr[i];

        }
        System.out.println(maxSum);

        for (int i = count ; i<arr.length;i++) {
            int currentSum = maxSum + arr[i] - arr[i-count];
            System.out.println(currentSum);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
