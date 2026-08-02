package basic_programs_while_studying_other_lang.module_9_contructor_destructor;

public class Lucky_number {
    int num;

    // default constructor.............
    Lucky_number(){
        System.out.println("Please enter any value");
    }

    // parameterized constructor........
    Lucky_number(int n){
       // this.num = num;
        num = n;
        System.out.println("Your luckY Number is : "+ num);
    }
}
