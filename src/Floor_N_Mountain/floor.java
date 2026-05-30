package Floor_N_Mountain;

public class floor {
    static void main() {
        int[]arr = {4,6,8,10,14,18,22,26,30};
        int target = 7;
        int ans = floor_number(arr,target);
        System.out.println(ans);
    }

    static int floor_number(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;

        while (start<= end){
            int mid = start+(end-start)/2;

            if(arr[mid]<target){
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }else {
                return mid;
            }
        }
        return arr[end];
    }
}
