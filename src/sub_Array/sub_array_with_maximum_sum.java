package sub_Array;

// this is brute force
// best solution is kedance algo....

public class sub_array_with_maximum_sum {
    static void main() {
        int[] arr = {1,2,3,4};

        int max_sum = Integer.MIN_VALUE;

        for (int s = 0; s < arr.length; s++) {
            int sum=0;

            for (int e = s; e < arr.length ; e++) {
                sum += arr[e];
            }

            if(sum > max_sum){
                max_sum = sum;
            }
        }

        System.out.println(max_sum);
    }
}
