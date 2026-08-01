package basic_programs_while_studying_other_lang.module_2;

public class Vita_tp {
    static void main() {
        int a = 10;
        int b = 20;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a : "+a+" b= "+b);


        // multi way..
        a=  a*b;
        b = a/b;
        a=  a/b;

        System.out.println("a : "+a+" b= "+b);


        // another way....

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a : "+a+" b= "+b);
    }
}
