package basic_programs_while_studying_other_lang.module_1_operator_and_expression;

public class Ternary {
    static void main() {
        int a = 11;
        int b = 20;

        int max = (a>b)?a:b;
        System.out.println(max);

        boolean ans = (a%2 ==0)? true : false;
        System.out.println(ans);
    }
}

/*
in c++ main function is always int main() it cant be void main() becoz of the internal mechanism
#include <iostream>
using namespace std;

int main() {
        int a = 10;
        int b = 20;

        int max = (a>b)?a:b;
        cout << max;
     }

 */