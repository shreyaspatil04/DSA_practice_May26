package Floor_N_Mountain;

// equal to not


public class ceilling_but_equal_not_allowed_only_next {
    static void main() {
        int[]arr = {4,6,8,10,14,18,22,26,30};
        int target = 8;
        int ans = only_next(arr,target);
        System.out.println(ans);
    }

    static int only_next(int[]arr,int target){

        int start = 0;
        int end = arr.length-1;

        while (start < end){       // at the end start and end will be on same point
                                   // before avoiding next iteration afetr both on same point
                                   // thats why start < end
            int mid = start +(end-start)/2;

            if(arr[mid]>target){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return arr[start];
    }
}
