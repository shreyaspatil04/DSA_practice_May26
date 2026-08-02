package basic_programs_while_studying_other_lang.module_2;

public class largest_of_three {
    static void main() {
        int a= 15;
        int b =10 ;
        int c =25 ;

        if(a>b && a>c){
            System.out.println(a+" is the largest");
        } else if (b>c) {                 ///  here A is already checked and its not largest  so there is no point to check with b
            System.out.println(b+" is the largest");
        }else {
            System.out.println(c+" is the largest");
        }
    }
}
