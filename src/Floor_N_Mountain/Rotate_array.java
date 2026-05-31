package Floor_N_Mountain;

import java.util.Arrays;

public class Rotate_array {
    static void main() {
        int[]arr={11,12,13,14,15,16,17,18,19};
        int k = 5;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[]arr, int k){
        k = k% arr.length;

        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }

    static void reverse(int[]arr,  int s, int e){
        while (s<e){
            swap(arr,s,e);
            s++;
            e--;
        }
    }

    static void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]= temp;
    }
}
