package practice_1;

import java.util.Scanner;

public class Reverse_the_number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int ans = reverse(num);
        System.out.println(ans);
    }

    static int reverse(int n){
        int rev =0;

        while (n>0){
            int single_num = n%10;
            rev = rev*10+single_num;
            n = n/10;
        }
        return rev;
    }

}
