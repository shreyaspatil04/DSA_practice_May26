package basic_programs_while_studying_other_lang.module_3_loop;

import java.util.Scanner;

public class fibonaciii {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n ; i++) {
            System.out.print(a+" ");
            int c = a+b ;
            a = b;
            b = c;
        }
    }
}
