package org.example;

public class Main {
    public static void main(String[] args) {
        //Create 4 restaurants, 8 drivers, 10 customers
        Customer johnDoe = new Customer("John Doe", "0000 Street", "LA County");
        Customer janeDoe = new Customer("Jane Doe", "0000 Street", "LA County");
        Customer mrSmith = new Customer("Mr.Smith", "111 Street", "Orange County");
        Customer bob = new Customer("Bob", "22 Street", "San Bernardino County");


        //Register them onto food platform - CPPFoodDelivery

        //Testing of dietary restrictions
        johnDoe.setDietaryRestrictions("no restriction");
        System.out.println(johnDoe);
        System.out.println("Changing dietary restrictions for John Doe...");
        johnDoe.setDietaryRestrictions("paleo");
        System.out.println(johnDoe);

        janeDoe.setDietaryRestrictions("paleo");
        mrSmith.setDietaryRestrictions("vegan");
        bob.setDietaryRestrictions("nut allergy");
    }
}