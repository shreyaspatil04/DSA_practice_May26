package basic_Array;

import java.util.Arrays;

public class Move_zero_to_end {
    static void main() {
        int[] arr = {3,4,0,2,14,5,0,2,1,0,4,0,4,2,0,0,4,4,6,7,3,2};
        int pointer = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                swap(arr,i,pointer);
                pointer++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[]arr,int s, int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
