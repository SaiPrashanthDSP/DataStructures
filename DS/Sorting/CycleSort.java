package Sorting;

public class CycleSort {

    public static void main(String[] args) {
        int []numbers = {2,4,6,8,1,0,3};
        cycleSort(numbers);
        for(int i : numbers) {
            System.out.println(i);
        }
    }

    static void cycleSort( int []numbers) {
        for (int start = 0; start < numbers.length-1;start++) {
            int index = start, item = numbers[start];
            for(int i = start+1;i < numbers.length;i++) {
                if(numbers[i] < item) {
                    index++;
                }
            }
//            if(index == start) continue;
//            while (index < numbers.length && item == numbers[index]) index++;

            int temp = item;
            item = numbers[index];
            numbers[index] = temp;
            while(index != start) {
                index = start;
                for(int i = start+1;i < numbers.length;i++) {
                    if(numbers[i] < item) {
                        index++;
                    }
                }
//                if(index == start) continue;
//                while (index < numbers.length && item == numbers[index]) index++;
                temp = item;
                item = numbers[index];
                numbers[index] = temp;
            }
        }
    }
}
