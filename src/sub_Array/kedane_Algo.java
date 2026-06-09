package sub_Array;

public class kedane_Algo {
    static void main() {
        int[] arr = {-5, 4, 6, -3, 4, -1};
        int ans = find_maxSum(arr);
        System.out.println(ans);
       }

        static int find_maxSum ( int[] arr){
            int sum = 0;
            int max_sum = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {

                sum += arr[i];

                if (sum > max_sum) {
                    max_sum = sum;
                }

                if (sum < 0) {
                    sum = 0;
                }

            }
            return max_sum;
        }
    }

