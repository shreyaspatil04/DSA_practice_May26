package basic_programs_while_studying_other_lang.module_1_operator_and_expression;

import java.util.Scanner;

public class Switch_case {
    static void main() {


        Scanner sc =new Scanner(System.in);

        System.out.println("enter your 1st number :");
        int a = sc.nextInt();
        System.out.println("enter your 2nd number :");
        int b = sc.nextInt();

        System.out.println("1.Addition  2.Subtraction  3.Multiplication  4.Division");
        int choice = sc.nextInt();

       // float blahhh = 3.12323f;    float chi bakchodi in java

        switch (choice){

            case 1 :
//                System.out.println(a+b);
//                    break;
                int ans_addition = a+b;
                System.out.println(ans_addition);
                break;

            case 2:
                int ans_sub = a-b;
                System.out.println(ans_sub);
                break;

            case 3:
                System.out.println(a*b);
                break;

            case 4:
                float ans_division = (float)a/b;
                System.out.println(ans_division);
                break;

            default:
                System.out.println("Nikal BKL...");
        }
    }
}

// in c++

/*
#include <iostream>
using namespace std;
int main(){
  int a;
  int b;
  int choice;

  cout<<"enter value for a";
  cin >> a;

  cout<<"enter value for b";
  cin >> b;

  cout << "1.Addition  2.Subtraction  3.Multiplication  4.Division \n";
  cin >> choice;

  switch (choice){
             case 1 :
//                System.out.println(a+b);
//                    break;
                int ans_addition = a+b;
                cout << ans_addition;
                break;

            case 2:
                int ans_sub = a-b;
                cout << ans_sub;
                break;

            case 3:
                 int ans_mul = a*b;
                cout << ans_mul;
                break;

            case 4:
                float ans_division =(float)a/b;
                cout << "ans_division";
                break;

            default:
                cout << "Nikal BKL....";
  }
}
 */
