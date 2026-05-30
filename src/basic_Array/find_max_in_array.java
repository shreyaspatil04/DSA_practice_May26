package basic_Array;

public class find_max_in_array {
    static void main() {
        int arr[] ={13,18,19,11,12,14};
        int ans = findMax(arr);
        System.out.println(ans);
    }

    static int findMax(int[] arr){
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]> arr[max] ){
               max = i;
            }
        }
        return arr[max];
    }


}
