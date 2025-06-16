public class IsArraySorted {

    public static boolean isArraySorted(int[] array) {
        for (int i=1;i<array.length;i++) {
            if(array[i-1] > array[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args) {

        System.out.println(isArraySorted(new int[]{1,2,4,6}));

    }
}
