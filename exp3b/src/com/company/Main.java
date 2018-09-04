package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a ;
        System.out.println("Enter one of the following \n1.Single\n2.Multi Level\n3.Hierarchical");
        a= sc.nextInt();
        switch(a){
            case 1: subdomian s = new subdomian(); s.display(); break;
            case 2: son so = new son();so.display(); break;
            case 3:
                ubuntu u = new ubuntu();
                mint m = new mint();
                u.display();
                m.display();
                break;
        }

    }
    public static class domain{
        void display(){
            System.out.println("This is domain");
        }
    }
    public static class subdomian extends domain{
        @Override
        void display() {
            super.display();
            System.out.println("This is subdomain");
        }
    }

        public static class debian{
        void display(){
            System.out.println("This is a debian package");
        }
    }
    public static class son extends father{
        @Override
        void display() {
            super.display();
            System.out.println("This is Son");
        }
    }
    public static class father extends grandfather{
        @Override
        void display(){
            super.display();
            System.out.println("Father");
        }
    }
    public static class grandfather{
        void display(){
            System.out.println("Grandfather is called");
        }
    }
    public static class mint extends debian {

        @Override
        void display() {
            super.display();
            System.out.println("This is Mint");
        }
    }
    public static class ubuntu extends debian {
        @Override
        void display() {
            super.display();
            System.out.println("This is ubuntu");
        }
    }
}
