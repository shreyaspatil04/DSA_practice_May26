package Floor_N_Mountain;

public class peak_In_Mountain {
    static void main() {
        int[]arr =  {2,4,6,8,10,11,9,7};
        int ans = find_pivot(arr);
        System.out.println(ans);
    }

    static int find_pivot(int[]arr){
        int start =0;
        int end = arr.length-1;

        while (start<end){
            int mid = start+(end-start)/2;

            if(arr[mid]<arr[mid+1]){
                start= mid+1;
            } else if (arr[mid]>arr[mid+1]) {
                end=mid;
            }
        }
        return arr[start];       // or end both on same point
    }
}
