package sub_Array;

public class Sum_Of_SubbArray {

    //o(n3) complexity....

//    static void main() {
//        int[] arr = {1,2,3};
//
//        for (int s = 0; s < arr.length; s++) {
//            for (int e = s; e < arr.length; e++) {
//                int sum = 0;
//
//                for (int i = s; i <= e ; i++) {
//                    sum += arr[i];
//                }
//                System.out.println(sum);
//            }
//        }
//    }


    // optimal o(n2)

    static void main() {
        int[] arr = {1,2,3};

        for (int s = 0; s < arr.length; s++) {
            int sum=0;
            for (int e = s; e < arr.length ; e++) {
                sum += arr[e];
                System.out.println(sum);
            }
        }
    }
}
