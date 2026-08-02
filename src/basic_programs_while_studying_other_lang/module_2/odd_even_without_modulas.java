package basic_programs_while_studying_other_lang.module_2;

import java.util.Scanner;

public class odd_even_without_modulas {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number :");
        int a = sc.nextInt();

        if((a & 1) == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
