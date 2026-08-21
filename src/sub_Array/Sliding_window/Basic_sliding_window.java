package sub_Array.Sliding_window;

public class Basic_sliding_window {
    public static void main(String[] args) {

        int[] arr = {100,200,300,400,500};

        // first window
        int k =2;

        if(k>arr.length) {
            System.out.println("Invalid window size Or array is smaller than your window...");
        }else {

            int sum =0;

            for(int i = 0 ; i<k; i++) {
                sum += arr[i];
            }
            int maximum_sum = sum;

            // now change the window

            for(int i = k ; i<arr.length ; i++) {
                // add new element
                sum  = sum + arr[i];

                // remove left element..
                sum = sum - arr[i-k];

                if(sum > maximum_sum) {
                    maximum_sum = sum ;
                }
            }
            System.out.println(maximum_sum);
        }
    }
}
