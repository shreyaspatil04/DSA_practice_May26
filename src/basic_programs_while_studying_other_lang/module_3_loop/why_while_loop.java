package basic_programs_while_studying_other_lang.module_3_loop;

import java.util.Scanner;

public class why_while_loop {
    static void main() {
        int a =  67;
        guess(a);
    }
    static void guess(int a){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int b = sc.nextInt();
        while (b != a){
            System.out.println("enter again..sryy...");
             b = sc.nextInt();
        }
        System.out.println("correct");

    }
}
