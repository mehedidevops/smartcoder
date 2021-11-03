package com.javabasics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Welcome to my World");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        double number1 = input.nextDouble();
        System.out.println("Enter another number");
        double number2 = input.nextDouble();
        
        double addition = number1+number2;
        System.out.println("addition = " + addition);
        
    }
    
}
