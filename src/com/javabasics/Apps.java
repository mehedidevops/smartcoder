package com.javabasics;

public class Apps {

    public static void main(String[] args) {

        CovidVaccine vaccine = new CovidVaccine();
        vaccine.setFirstName("Aman");
        vaccine.setLastName("Uddin");
        vaccine.setDateOfBirth("08051980");
        System.out.println(vaccine.firstName + " " + vaccine.lastName);

    }
}
