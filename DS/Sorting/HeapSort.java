package Sorting;

public class HeapSort {
    static void heapSort(int []arr) {
        buildHeap(arr,arr.length);
        for(int i = arr.length-1; i>=1; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr,0,i);

        }

    }

    static void heapify(int []arr,int i,int heapSize) {
        int largest = i;
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;
        if(leftChild < heapSize && arr[leftChild] > arr[largest]  ) {
            largest = leftChild;
        }
        if(rightChild < heapSize && arr[rightChild] > arr[largest]  ) {
            largest = rightChild;
        }
        if(largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr,largest,heapSize);

        }
    }

    static void buildHeap(int []arr,int arrayLength) {
        int length = arrayLength;
        for(int start = length/2-1;start >=0;start-- ) {
            heapify(arr,start,arrayLength);
        }
    }
    public static void main(String []args) {

        int []numbers = {2,4,6,8,1,0,3};
        heapSort(numbers);
        for(int number: numbers) {
            System.out.println(number);
        }

    }
}
