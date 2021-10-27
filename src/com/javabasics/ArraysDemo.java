package com.javabasics;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] bedroom = new int[5];  //0, 1, 2, 3, 4 = Index
        bedroom[0] = 200;
        bedroom[1] = 50;
        bedroom[2] = 30;
        bedroom[3] = 25;
        bedroom[4]= 300;
        //System.out.println(bedroom.length);

        String [] name = new String[5];
        name[0] = "Munna";
        name[1] = "Amdaul";
        name[2] = "Hussain";
        name[3] = "Marzan";
        name[4] = "Rubal";

        //System.out.println(name[4]);

        String itemDescription1 = "Shirt";
        String itemDescription2 = "Jacket";
        String itemDescription3 = "Shoe";

        String [] itemsDesciption = new String[3];
        itemsDesciption[0] = "Shirt";
        itemsDesciption[1] = "Jacket";
        itemsDesciption[2] = "Shoe";
        //System.out.println(itemsDesciption[2]);

        String [] itemsDesciptions = {"Shirt", "Jacket", "Shoe"};
        System.out.println(itemsDesciptions[0]);






    }





}
