package basic_programs_while_studying_other_lang.module_3_loop;

public class ArmStrong {
    static void main() {
        int n = 1634;
        int original = n;
        int size = String.valueOf(n).length();   // int value converted into string
        int sum = 0;
        while (n>0){
            int single = n%10;
            sum += Math.pow(single,size);
            n = n/10;
        }

        if(original == sum){
            System.out.println("Yeahhh its is an Armstrong Number...");
        }else {
            System.out.println("Nahhhhh broo...its not an ArmStrong");
        }
//        String a = "shreyas";
//        a.length();
    }
}
