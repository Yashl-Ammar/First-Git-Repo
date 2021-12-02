package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // adding two numbers
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter first number : ");
        a = sc.nextInt();
        System.out.println("Enter second number : ");
        b= sc.nextInt();

        System.out.println("The sum is : " + (a+b));
    }
}
