package sorting;

import java.util.Arrays;

public class selection {
    static void main() {
        int[]arr={3,1,2,5,4};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection_sort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max= findmax(arr,0,last);
            swap(arr,last,max);
        }
    }


    static int findmax(int[]arr, int s, int e){
        int max = s;
        for (int i = 1; i <= e; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int[]arr,int a, int b){
        int temp = arr[a];
        arr[a] =  arr[b];
        arr[b] = temp;
    }
}
