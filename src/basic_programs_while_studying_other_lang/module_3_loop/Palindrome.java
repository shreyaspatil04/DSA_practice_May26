package basic_programs_while_studying_other_lang.module_3_loop;

public class Palindrome {
    static void main() {
        int n = 134431;
        int temp = n;
        int rev = 0;

        while (temp>0){
            rev = rev * 10 + temp%10;
            temp=temp/10;
        }

        if(n == rev){
            System.out.println("Palindrome...");
        }else {
            System.out.println("Not P");
        }
    }
}
