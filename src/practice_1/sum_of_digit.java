package practice_1;

import java.util.Scanner;

public class sum_of_digit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int ans= sum(num);
        System.out.println(ans);
    }

    static int sum(int n){
        int ans = 0;

        while (n>0){
           int single_num = n%10;
           ans= ans + single_num;       // ans += val;
           n = n/10;
        }
        return ans;
    }

}
