package basic_Array;

public class Linear_search {
    static void main() {
        int[] arr = {12,1,11,13,14,15,21,6,4,3,54};
        int target = 11;
        int ans = linear_search(arr,target);
        System.out.println(ans);
    }

    static int linear_search(int[] arr , int target){

        if(arr.length==0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
