package com.javabasics;

public class ForLoop {

    public static void main(String[] args) {


        //0,1,2,3,4,5
        // initialization= 0   boolean = true;   a++ = a= a+1

//
//        for (int i = 5; i <= 100; i++){
//            System.out.println(i);
//
//        }

//        for(int a = 0; a <= 10; a++){
//
//            System.out.println(a);

        //


        //a = 0; 0<5 =true; print 0

        //0+1=1  1<=5 = true; print 1
        //1+1=2  2<=5 = true; print 2
        //2+1=3  3<=5 = true; print 3
        //3+1=4  4<=5 = true; print 4
        //4+1=5  5<=5 = true; print 5
        //5+1=6  6<=5 = false; program exist

//            for(int a1 = 10; a1 > 1; a1--){
//
//                System.out.println(a1);

        //a1=10 10>1=true; print 10
        //a1=a1-1=10-1=9 9>1 true print9


        String[] names = {"Jamil", "Munna", "Rubel Bhai", "Salman", "Uncle"};
        for (String name1 : names){
            if(name1 == "Munna"){
                System.out.println(name1);
            }
        }

        //0         1           2           3           4

        System.out.println("---------For Loop---------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("##############################");

        System.out.println("--------------For Each Loop-----------------");//*****
        for (String name : names) {
            System.out.println(name);
        }

    }

}








