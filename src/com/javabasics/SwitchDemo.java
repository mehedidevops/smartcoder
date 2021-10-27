package com.javabasics;

public class SwitchDemo {

    public static void main(String[] args) {


        int age = 36;

        switch (age){
            case 36:
                System.out.println("Adult");

            case 25:
                System.out.println("Young");
                break;
            case 17:
                System.out.println("Kids");

            default:
                System.out.println("Old");
        }



    }

}
