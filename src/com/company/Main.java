package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // adding two numbers
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number : ");
        a = sc.nextInt();
        System.out.println("Enter 123 number : ");
        c= sc.nextInt();

        System.out.println("The sum is : " + (a+c));
    }
}
