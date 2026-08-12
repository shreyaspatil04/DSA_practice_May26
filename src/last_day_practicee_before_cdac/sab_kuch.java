package last_day_practicee_before_cdac;

import java.util.Arrays;
import java.util.Scanner;

public class sab_kuch {
//    static void main() {
//        int[] arr = {5,4,3,2,1};
//
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 1; j < arr.length; j++) {
//                if(arr[j]<arr[j-1]){
//                    swap(arr,j,j-1);
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(arr))
//        ;
//    }

    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

//    static void main() {
//        int [] arr = {5,4,3,2,1};
//        insertion_sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    static void  insertion_sort (int [] arr){
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j > 0; j--) {
//                if(arr[j] < arr[j-1]){
//                    swap(arr,j,j-1);
//                }
//            }
//        }
//    }

    // accept 10 numbers (without array)
    /*

    static void main() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter 10 numbers :- ");
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            sum += n;
        }
        System.out.println(sum);
    }

     */



    /*
    // find factorial of given number....

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find its Factorial....");
        int n = sc.nextInt();
        int ans = find_factorial(n);
        System.out.println(ans);
    }
    static int find_factorial(int n){
        int fact = 1;

        if(n >= 0){
            if(n==0){
                return fact;
            }else {
                for (int i = n; i > 0 ; i--) {
                    fact = fact*i;
                }
                return fact;
            }
        }else {
            System.out.println("Enter appropriate value : ");
        }
        return -1;
    }
    */


    /*


    // accept number and give count of positive negative and zer0
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int even_count = 0;
        int odd_count = 0;
        int zero_count = 0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if(n > 0){
                even_count++;
                System.out.println(n+" is a positive number");
            } else if (n < 0) {
                odd_count++;
                System.out.println(n+" is a negative number");
            }else {
                zero_count++;
                System.out.println(n+" is a zero..");
            }

        }

        System.out.println("Even number count : "+even_count);
        System.out.println("Odd Number count : "+odd_count);
        System.out.println("Zero number count : "+zero_count);


    }
     */




    /*


    // print a table

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for it's Table :");
        int n = sc.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
 */


    /*


    // accept number until user enrters zero and give addition
    static void main() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter number till 0");
        int n = sc.nextInt();
        while (n != 0){
            System.out.println("Enter Again..");
            sum += n;
            n = sc.nextInt();
        }
        System.out.println(sum);
    }


     */



    /*
    // fibonacci series

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter number :");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i <= n ; i++) {
            System.out.print(a+" ");

            int c= a+b;
            a=b;
            b=c;
        }
    }

     */


    /*


    // accept 10 numbers and give the highest one

    static void main() {
        Scanner sc = new Scanner(System.in);
        int highest = Integer.MIN_VALUE;

        System.out.println("Enter any 10 values...");
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if(n > highest){
                highest = n;
            }
        }
        System.out.println("Highest Number is :"+highest);
    }

     */


    /*
    // accept 10 numbers and give the Lowest  one
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 nummbers : ");
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i <10 ; i++) {
            int n = sc.nextInt();

            if(n<minimum){
                minimum = n;
            }
        }
        System.out.println("Minimum value is : "+minimum);
    }

     */




    /*
    // accept 10 numbers and give the 2nd highest..
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");
        int highest = Integer.MIN_VALUE;
        int second_highest = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if(n > highest){
                second_highest = highest;
                highest = n;
            } else if (n > second_highest && n != highest) {
                second_highest = n;
            }
        }

        System.out.println(second_highest);
    }

     */





    /*


    //Write a program to print every integer between 1 and n divisible by m. Also report
    //whether the number that is divisible by m is even or odd.
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the end of the Range....");
        int n = sc.nextInt();

        System.out.println("Enter a number you want a divisible of....");
        int m = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            if(i % m == 0){
                System.out.println(i);
            }
        }
    }

     */





    /*
    // print all armstrong number from 1 to 200000

    static void main() {

        for (int i = 1; i <= 200000 ; i++) {
            int temp = i;
            int sum =  0;
            int size = String.valueOf(i).length();

            while (temp>0){
                int n = temp%10;
                sum += Math.pow(n,size);
                temp = temp/10;
            }

            if(i == sum){
                System.out.println(i);
            }
        }
    }

     */





    /*

    // Print all special numbers between 1 to 200000
    static void main() {


        for (int i = 1; i <= 200000 ; i++) {
            int temp = i;
            int sum = 0;
            int  product = 1;

            while (temp > 0){
                int n = temp%10;
                sum += n;
                product *= n;
                temp= temp/10;
            }

            if(sum == product){
                System.out.println(i);
            }
        }
    }

     */





    /*
    // accept number from user and check it is prime or not...

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int n = sc.nextInt();

        Boolean is_Prime = true;

        if(n<=1){
            is_Prime = false;
        }
        for (int i = 2; i < n ; i++) {
            if(n%i == 0){
                is_Prime = false;
                break;
            }
        }

        System.out.println(is_Prime);
    }

     */





    /*

    // prime number from 1 to n

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Range till you want Prime number :");
        int n = sc.nextInt();

        for (int i = 2; i <= n ; i++) {
            int num = i;
            boolean is_prime = true;

            for (int j = 2; j < i; j++) {
                if(num % j ==  0){
                    is_prime = false;
                    break;
                }
            }
            if(is_prime == true){
                System.out.println(i);
            }
        }
    }

     */




    /*
     // accpet 5 number from user in array

    static void main() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number : to check its present in array or not...");
        int n = sc.nextInt();
        boolean is_present = false;
        for (int i = 0; i < arr.length; i++) {
            if(n == arr[i]){
                is_present = true;
                break;
            }
        }

        if (is_present){
            System.out.println("Yes its present...");
        }else {
            System.out.println("Its not present...");
        }
    }


     */



    /*
    //Accept 10 numbers in an array; accept a number to be deleted from the array. Delete the
    //number and print the new array.

    static void main() {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[10];
        System.out.println("Enter 10 numbers to add in array...");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter a number to remove from the array...");
        int n = sc.nextInt();

        int index = -1;
        for (int i = 0; i < 10; i++) {
            if(n == arr[i]){
                index = i;
                break;
            }
        }

        if(index != -1){
            for (int i = index; i < 9; i++) {
                arr[i] = arr[i+1];
            }
        }

        for (int i = 0; i < 9; i++) {
            System.out.print(arr[i]+" ");
        }

    }

     */



    /*
    //Accept data in two 3*3 matrices and calculate the sum of the matrices.

    static void main() {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];

        System.out.println("Enter values in matrics A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter values in matrics B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Addition of both Matrix is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }

    }

     */


    /*
    // Accept data in a 4*4 matrix and transpose it.

    static void main() {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[4][4];
        int [][] T = new int[4][4];

        System.out.println("Enter values for 4*4 matrix...");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                T[i][j] = A[j][i];
            }
        }

        System.out.println("Transpose of matrix is...");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(T[i][j]+" ");
            }
            System.out.println();
        }
    }

     */



    /*

    // Accept a string from the user, accept a character from the user and count the occurrence
    //of the same.

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string :");
        String str = sc.nextLine();

        System.out.println("Enter a character to count its frequency...");
        char c = sc.next().charAt(0);

        int count = 0;

        char arr[] = str.toCharArray();
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == c){
                count++;
            }
        }

//        for (char a : str.toCharArray()) {
//            if(a==c){
//                count++;
//            }
//        }
        System.out.println(count);
    }

     */



    /*
    // check palindrome...of string...
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        boolean is_Palindrome = true;
        int left = 0;
        int right = str.length()-1;

        while (left <= right){
            if(str.charAt(left) != str.charAt(right)){
                is_Palindrome = false;
                break;
            }
            left++;
            right--;
        }

        if(is_Palindrome){
            System.out.println("Yes.. given string is plaindrome...");
        }else {
            System.out.println("Given string is not palindrome...");
        }

    }

     */



    /*
    static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15};
        int[] mountain = {1,3,5,6,7,4,3};
        int target = 4;
        int ans = binary_search(arr,target);
        int floor = floor_wala_func(arr,target);
        int ceilling = ceilling_wala_func(arr, target);
        int peak = find_peak_in_mountain(mountain);
        System.out.println(ans);
        System.out.println(floor);
        System.out.println(ceilling);
        System.out.println(peak);


    }

    static int binary_search(int[]arr , int target ){

        int s = 0;
        int e = arr.length-1;

        while (s <= e){
            int mid = s+(e-s)/2;

            if(target > arr[mid]){
                s= mid+1;
            } else if (target< arr[mid]) {
                e = mid-1;
            }else {
                return mid;
            }

        }
        return -1;
    }

    static int floor_wala_func(int[]arr , int target ){

        int s = 0;
        int e = arr.length-1;

        while (s <= e){
            int mid = s+(e-s)/2;

            if(target > arr[mid]){
                s= mid+1;
            } else if (target< arr[mid]) {
                e = mid-1;
            }else {
                return mid;
            }
        }
        return e;
    }

    static int ceilling_wala_func(int[]arr , int target ){

        int s = 0;
        int e = arr.length-1;

        while (s <= e){
            int mid = s+(e-s)/2;

            if(target > arr[mid]){
                s= mid+1;
            } else if (target< arr[mid]) {
                e = mid-1;
            }else {
                return mid;
            }
        }
        return s;
    }

    static int find_peak_in_mountain (int[] arr){
        int s = 0;
        int e = arr.length-1;

        int mid = s+(e-s)/2;

        if(arr[mid] < arr[mid+1]){
            s = mid+1;
        } else if (arr[mid] > arr[mid+1]) {
            e= mid;
        }
        return s;
    }



     */

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string...");
        String str = sc.nextLine();

        String rev ="";

        for (int i =  str.length()-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);
    }
}
