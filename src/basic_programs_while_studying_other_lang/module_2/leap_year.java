package basic_programs_while_studying_other_lang.module_2;

public class leap_year {
    static void main() {
        int year = 600;

        if(year%400==0 || (year%4==0 && year%100 != 0 )){
            System.out.println("Leap year....");
        }else {
            System.out.println("tuzi layki aahe ka...leap year banychi..");
        }
    }
}
