package basic_programs_while_studying_other_lang.module_3_loop;

import java.util.Scanner;

public class factorial {
//    static void main() {
//        int n = 6;
//        int ans = factorialllllll(n);
//        System.out.println(ans);
//    }
//
//    static int factorialllllll(int n){
//        if(n == 0){
//            return 1;
//        }
//        return n * factorialllllll(n-1);
//    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number -: ");
        int n = sc.nextInt();
        int fact =1 ;

        for (int i = 1; i <= n ; i++) {
            fact = fact*i;
        }

        System.out.println("Factorial of "+n+" is :: "+fact);
    }
}