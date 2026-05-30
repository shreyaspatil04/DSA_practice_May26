package practice_1;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int user_number = sc.nextInt();
        int ans = factorial(user_number);
        System.out.println(ans);
    }

    static int factorial(int num){

        if(num == 0){
            return 1;
        }

        int fact = 1;

//        for (int i = num; i > 0 ; i--) {
//            fact = fact*i;
//        }
//        return fact;

        for (int i = 1; i <= num ; i++) {
            fact = fact*i;
        }
        return fact;
    }
}
