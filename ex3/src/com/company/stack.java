package com.company;

/**
 * Created by Gaurav Jain on 9/4/2018.
 */
public class stack {
    int arr[];
    int top;
    stack(int num){
        arr = new int[num];
        top = 0;
    }
    void push(int a){
        System.out.println("Super push called for "+ a);
    }
    void pop(){
        System.out.println("Super pop called");
    }
}
