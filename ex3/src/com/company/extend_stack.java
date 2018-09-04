package com.company;

/**
 * Created by Gaurav Jain on 9/4/2018.
 */
public class extend_stack extends stack{
    extend_stack(int num){
        super(num);
    }
    @Override
    void push(int a) {
        super.push(a);
        if (this.top == this.arr.length) {
            System.out.println("Array Full");
        } else {
            this.arr[this.top] = a;
            this.top++;
            System.out.println(a + " is pushed");
        }
    }
    @Override
    void pop() {
        super.pop();
        System.out.println("Popped "+this.arr[this.top - 1]);
        this.top --;
    }
    void display() {
        System.out.println("Array is");
        for(int i =this.top-1;i>=0;i--){
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }
}
