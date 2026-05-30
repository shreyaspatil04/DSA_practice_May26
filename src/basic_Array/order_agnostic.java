package basic_Array;

import java.util.Arrays;

public class order_agnostic {
    static void main() {
        int[] arr= {99,89,79,69,59,49,39,29};
        int target = 69;
        int ans = order_agnostic_search(arr,target);
        System.out.println(ans);
    }

    static int order_agnostic_search(int[]arr,int target){
        int s = 0;
        int e = arr.length-1;

        if(arr[s]<arr[e]){
           int a =  binarysearch_aesc(arr,target);
           return a;
        }
        else {
           int d = binarysearch_desc(arr,target);
           return d;
        }
    }

    static int  binarysearch_aesc(int[] arr, int target){
        int start  = 0;
        int end = arr.length-1;

        while (start<= end){
            int mid = start+(end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start= mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int  binarysearch_desc(int[] arr, int target){
        int start  = 0;
        int end = arr.length-1;

        while (start<= end){
            int mid = start+(end-start)/2;

            if(target>arr[mid]){
                end = mid-1;
            }
            else if(target<arr[mid]){
                start= mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
