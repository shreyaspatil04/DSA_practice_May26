package sorting;

import java.util.Arrays;

public class insertion_sort {
    static void main() {
        int[] arr = {3,1,5,4,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    static void swap(int[] arr, int s, int k){
        int temp = arr[s];
        arr[s] = arr[k];
        arr[k] = temp;
    }
}
