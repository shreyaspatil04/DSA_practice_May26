package sub_Array;


// o(n3)   just printing no optimization

public class brute_force_for_subArray {
    static void main() {
        int[] arr = {1,2,3,4,5};

        for (int s = 0; s < arr.length; s++) {
            for (int e = s; e < arr.length; e++) {
                for (int i = s; i <=e ; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
}
