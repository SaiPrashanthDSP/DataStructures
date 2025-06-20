package Sorting;

public class UnionOfTwoArrays {

    static void UnionOfArrays(int []array1, int []array2) {
        int i = 0;
        int j = 0;
        while(i< array1.length && j < array2.length) {
            if ( i > 0 && array1[i-1] == array1[i]) {
                i++; continue;
            }
            if ( j > 0 && array2[j-1] == array2[j])  {
                j++;continue;
            }
            if(array1[i] < array2[j]) { System.out.println(array1[i]);i++;}
            else if(array1[i] > array2[j]) {System.out.println(array2[j]);j++;}
            else  { System.out.println(array1[i]);i++;j++;}
        }
    }
    public static void main(String[] args) {
        int[] firstArray = {5,6,10,20,30};
        int []secondArray = {5,7,10,10,30};
        UnionOfArrays(firstArray,secondArray);
        // 5,6,7,10,20,30
    }
}
