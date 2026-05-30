package basic_Array;

import java.util.Arrays;

public class reverse_array {
    static void main() {
        int[]arr = {1,2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[]arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

        static void swap(int[]arr, int s, int e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
        }

}
