package avd_array;

import java.util.Arrays;

public class remove_duplicates_from_array {
    static void main() {
        int[]arr = {1,1,2,2,2,3,3,3,3,4,4,5,5,5,6,6};

        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
