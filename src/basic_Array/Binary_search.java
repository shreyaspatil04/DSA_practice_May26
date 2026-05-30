package basic_Array;

public class Binary_search {
    static void main() {
        int[] arr ={12,13,14,15,16,17,18,19,20};
        int target = 29;
        int ans = binary_search(arr,target);
        System.out.println(ans);
    }

    static int binary_search(int[]arr, int target){
        int start=0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start) /2;

            if(arr[mid]< target){
                start=mid+1;
            }
            else if (arr[mid]>target){
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
