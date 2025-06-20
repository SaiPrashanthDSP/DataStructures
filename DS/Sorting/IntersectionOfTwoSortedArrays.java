package Sorting;
// Print the common elements in the both the arrays and  ignore the duplicates in same array.
public class IntersectionOfTwoSortedArrays {
    // 5,6,10,20,30
    // 5,7,10,10,30
    // O/p : 5,10,30
    static void intersectionOfArrays(int []array1, int []array2) {
        int i = 0;
        int j = 0;
        while(i< array1.length && j < array2.length) {
            if ( i > 0 && array1[i-1] == array1[i]) {
                i++;
                continue;
            }
            if(array1[i] < array2[j]) { i++;}
            else if(array1[i] > array2[j]) {j++;}
            else  { System.out.println(array1[i]);i++;j++;}
        }
    }
    public static void main(String[] args) {
        int[] firstArray = {5,6,6,10,20,30};
        int []secondArray = {5,7,10,10,30};
        intersectionOfArrays(firstArray,secondArray);
    }
}
