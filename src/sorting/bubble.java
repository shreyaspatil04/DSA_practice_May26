package sorting;

import java.util.Arrays;

public class bubble {
    static void main() {
        int[] arr = {3,1,5,4,2};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble_sort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[j]<arr[j-1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }
    static void swap(int[]arr,int j, int k){
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
