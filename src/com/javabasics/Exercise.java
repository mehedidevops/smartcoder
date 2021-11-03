package com.javabasics;

public class Exercise {

    public static void main(String[] args) {

        int[] sizes = {4, 18, 5, 20};
        for (int size : sizes) {
            if (size > 16) {//4 > 16   //18 > 16
            break;
            }
            System.out.println("Size:" + size + ",");
        }


    }
}
