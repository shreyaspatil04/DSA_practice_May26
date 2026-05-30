package Floor_N_Mountain;

public class search_in_mountain {
    static void main() {
        int[]arr =  {11,12,13,14,16,5,4,3};
        int target = 16;
        int ans = search_mountain(arr,target);
        System.out.println(ans);
    }

    static int search_mountain(int[]arr,int target){
        int peak  = find_peak(arr);

        if(arr[peak] == target){
            return peak;
        }

        int ans = binary_ascending(arr,target,0,peak-1);
        if(ans != -1){
            return ans;
        }else {
            int desc_ans = binary_desc(arr,target,peak+1,arr.length-1);
            return desc_ans;
        }

    }

    static int find_peak(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int mid = start+(end-start)/2;

            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            } else if (arr[mid]>arr[mid+1]) {
                end=mid;
            }
        }
        return start;    // or end
    }

    static int binary_ascending(int[]arr,int target,  int s, int e){

        while (s<=e){
            int mid = s+(e-s)/2;

            if(arr[mid]>target){
                e=mid-1;
            } else if (arr[mid]<target) {
                s=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }


    static int binary_desc(int[]arr,int target,  int s, int e){

        while (s<=e){
            int mid = s+(e-s)/2;

            if(arr[mid]<target){
                e=mid-1;
            } else if (arr[mid]>target) {
                s=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
