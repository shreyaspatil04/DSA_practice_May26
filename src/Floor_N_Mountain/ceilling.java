package Floor_N_Mountain;
// smallest number greater than equal to target
public class ceilling {
    static void main() {
        int[]arr={4,6,8,10,14,18,22,26,30};
        int target = 7;
        int ans = ceilling_number(arr,target);
        System.out.println(ans);
    }

    static int ceilling_number(int[]arr, int target){
        int s = 0;
        int e = arr.length-1;

        while (s <= e){
            int mid = s + (e - s)/2;


            if(target>arr[mid]){
                s= mid+1;

            } else if (target<arr[mid]) {
                e=mid-1;
            }else {
                return mid;
            }


        }
        return arr[s];
    }
}
