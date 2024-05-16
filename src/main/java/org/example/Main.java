package org.example;

public class Main {
    public static void main(String[] args) {
        //Create 4 restaurants, 8 drivers, 10 customers
        Customer johnDoe = new Customer("John Doe", "0000 Street", "LA County", "no restriction");
        Customer janeDoe = new Customer("Jane Doe", "0000 Street", "LA County", "low carb");
        Customer mrSmith = new Customer("Mr.Smith", "111 Street", "Orange County", "low fat");
        Customer bob = new Customer("Bob", "22 Street", "San Bernardino County", "low protein");


        //Register them onto food platform - CPPFoodDelivery

        System.out.println(johnDoe);
    }
}