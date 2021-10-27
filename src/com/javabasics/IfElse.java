package com.javabasics;

public class IfElse {

    public static void main(String[] args) {


        int i = 2;
        int j = 8;


        int drivingBoundary = 200;
        int drivingBoundary1 = 100;

        if (drivingBoundary > drivingBoundary1) {
            int a = 100;
            int b = 200;
            int sum = a + b;
            System.out.println(sum);

        } else {
            System.out.println("No operaton");

        }

        if ((i  <  1)  && (j  > 6)) {  //false && true = false
            System.out.println("not acceptable");
        }else{
            System.out.println("acceptable");
        }


    }
}