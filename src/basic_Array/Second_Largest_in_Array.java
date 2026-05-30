package basic_Array;

import java.util.Arrays;

public class Second_Largest_in_Array {
//    static void main() {
//        int[]arr = {3,2,1,4,5,3,2,1,5,5,5,4,3,2};
//        Arrays.sort(arr);
//        int max = arr.length-1;
//        int second_larg = -1;
//
//        for (int i = max; i > 0 ; i--) {
//            if(arr[i] != arr[max]){
//                second_larg = arr[i];
//                break;
//            }
//
//        }
//        System.out.println(second_larg);
//    }

    // not optimized complexity is O(N)2....


    static void main() {
        int[] arr = {2,1,1,2,3,4,3,3,5,5};
        int max = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int second_largest =  -1;

        for (int i = 0; i < arr.length; i++) {
            if((arr[i] != max) && (arr[i]>second_largest) ){
                second_largest=arr[i];
            }
        }

        System.out.println(second_largest);
    }
}


// here complexity is o(N)