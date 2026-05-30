package practice_1;

import java.util.Scanner;

public class fibonaccii_series {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number...");
        int seq = sc.nextInt();
        fibo(seq);
    }
    static void fibo(int seq){
       int n = seq;
       int a= 0;
       int b =1;

        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            int next= a+b;
            a=b;
            b=next;
        }
    }
}
