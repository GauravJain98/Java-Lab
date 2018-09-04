/**
 * Created by Gaurav Jain on 8/7/2018.
    1. Factorial
    2. Determined if leap year
    3. fiboonaci
    4. pallindrom
    5. largest
 */
import java.util.Scanner;

public class main {
    public static void factorial(Scanner sc) {
        System.out.print("Enter Number to calculate factorial of :");
        int n = sc.nextInt();
        long fact = 1;
        for (int i=1;i<=n;i++){
            fact = fact * i;
        }
        System.out.println("Factorial is "+fact);
    }
    public static void leap(Scanner sc){
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        if (year%4 == 0 && year%100 !=0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap year");
        }
    }
    public static void fibonnaci(Scanner sc) {
        System.out.print("Enter Number of tearms: ");
        int n = sc.nextInt();
        System.out.print("Enter first number: ");
        int t1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int t2 = sc.nextInt();
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + ",");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
    public static void palindrome(Scanner sc) {
        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (number == reverse) {
            System.out.println("Is a pallindrome");;
        }
        else{
            System.out.println("Is not a pallindrome");;
        }
    }

    public static void largest(Scanner sc) {
        System.out.print("Enter length of array");
        int n = sc.nextInt();
        System.out.print("Enter Array");
        int val;
        int[] a = new int[n] ;
        for (int i = 0;i<n ;i++){
            a[i] = sc.nextInt();
        }        
        int max = a[0];
    	for (int i = 1;i<n;i++){
            val = a[i];
            if (val > max){
                max= val;
            }
        }
        System.out.println("Largest value is "+ max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter one of the following :");
            System.out.println("0) Exit");
            System.out.println("1) Factorial of a number");
            System.out.println("2) Check if year is leap");
            System.out.println("3) Print the fibonnaci series");
            System.out.println("4) Check if number is a pallindrome");
            System.out.println("5) Largest in an array");
            int key = sc.nextInt();
            if (key == 0 ){
                System.exit(0);
            }
            switch (key) {
                case 1:
                    factorial(sc);
                    break;
                case 2:
                    leap(sc);
                    break;
                case 3:
                    fibonnaci(sc);
                    break;
                case 4:
                    palindrome(sc);
                    break;
                case 5:
                    largest(sc);
                    break;
            }
        }
    }
}
