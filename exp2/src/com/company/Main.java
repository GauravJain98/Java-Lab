package com.company;

//write a program depending on marks different greet message
//calculate  the area of circle with r as input
//find sum and avg of n inputted numbers
//implement stack using stack class


import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static void marks(Scanner sc) {
        System.out.println("Enter Marks");
        int marks = sc.nextInt();
        if(marks  >  80){
            System.out.println("Congratulations!! You are a class topper");
        }else if(marks  >  60){
            System.out.println("You are a good student");
        }else if(marks  >  40){
            System.out.println("You have just passed");
        }else{
            System.out.println("You have to give a retest");
        }
    }
    static void area(Scanner sc) {
        System.out.println("Enter radius");
        int r = sc.nextInt();
        System.out.println("Area of circle of radius " + r + " is :" + 3.14 * r *r);
    }
    static void sumA(Scanner sc) {
        System.out.println("Enter number of Integer");
        int n = sc.nextInt();
        int sum = 0,j;
        System.out.println("Enter Intergers");
        for(int i=0;i<n;i++){
            j = sc.nextInt();
            sum = sum + j;
        }
        System.out.println("Sum : "+sum+"\nAvg:"+sum/n);
    }
    static void stack(Scanner sc){
        Stack st = new Stack();
        System.out.println("stack: " + st);
        while(true) {
            System.out.println("1 to Push\n2 to Pop\n Else exit");
            int d = sc.nextInt();
            if (d == 1) {
                System.out.println("Enter Number");
                int a = sc.nextInt();
                st.push(a);
                System.out.println("push(" + a + ")");
                System.out.println("stack: " + st);
            } else if(d==2){
                try {
                    System.out.print("pop -> ");
                    Integer a = (Integer) st.pop();
                    System.out.println(a);
                    System.out.println("stack: " + st);
                } catch (EmptyStackException e) {
                    System.out.println("empty stack");
                }
            }else{
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose:\n1: Get a greeting on marks\n2: Get area of circle\n3: Find Sum and Avg of n numbers\n4: Get stack\n");
        int d = sc.nextInt();
        switch(d){
            case 1:marks(sc);break;
            case 2:area(sc);break;
            case 3:sumA(sc);break;
            case 4:stack(sc);break;
            default:
                System.out.println("INVALID INPUT");
        }
    }
}
