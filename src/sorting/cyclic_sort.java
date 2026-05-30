package sorting;

import java.util.Arrays;

public class cyclic_sort {
    static void main() {
        int[]arr = {3,1,2,0,5,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[]arr){
        int i=0;

        while (i< arr.length){
           int correct = arr[i];
            if(arr[i] != arr[correct]){
                swap(arr,correct,i);
            }else {
                i++;
            }
        }
    }

    static void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]=temp;
    }
}
