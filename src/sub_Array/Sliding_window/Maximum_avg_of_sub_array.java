package sub_Array.Sliding_window;

public class Maximum_avg_of_sub_array {
    static void main() {
        int[]arr = {100,200,300,400,500,600,700,800};
        int window_size = 3;
        double ans = findMaxAverage(arr,window_size);
        System.out.println(ans);
    }

    static double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for(int i = 0 ; i<k ; i++){
            sum = sum + nums[i];
        }
        int max_sum = sum;

        for(int i = k ; i<nums.length ; i++){
            // add new
            sum = sum + nums[i];
            // remove old one
            sum = sum - nums[i-k];

            if(sum > max_sum){
                max_sum = sum;
            }
        }
        return (double)max_sum / k;
    }
}
