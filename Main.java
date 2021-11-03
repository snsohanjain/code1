package com.codewithsohan;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean isCold = false;  // true or false

        if (isCold){
            // due to low temperature suggest you to wear a coat!
            System.out.println("It's Cold wear a coat!");
        }else {
            // temperature is normal no worry !
            System.out.println("No Worry You can go without  Coat! ");
        }

        // Traffic light signal
        boolean isLightGreen = true; // true or false
        boolean isLightYellow = true; // true or false
        boolean isLightRed = false; // true or false

        if (isLightGreen) {
            // traffic light is green
            System.out.println("Drive");
        }else if (isLightYellow){
            // traffic light is yellow//
            System.out.println("Slow Down!");
        } else {
            // light is in red
            System.out.println("Stop!");
        }
        // car windshield wipers on and off
        boolean isRaining = true;  // true or false

        if (isRaining){
            double carSpeed = 100;
            // raining is true
            System.out.println("wind shield wipers on");
            // car speed
            System.out.println("car speed is: " + carSpeed );
        }else {
            // raining is false
            System.out.println("wind shield wipers off");
        }
        boolean passport = false;
        boolean birthCertificate = false;
        boolean driversLicence = false;

        if (passport){
            System.out.println("A passport is a valid Id!");
        }else if (birthCertificate){
            System.out.println("A birth Certificate is valid Id");
        }else if (driversLicence){
            System.out.println("Drivers Licence is a valid Id");
        }else {
            System.out.println("Invalid Id Application is rejected !");
        }

        int ticketPrice = 10;
        boolean isStudent = false;
        int age = 16;

        if (age <=15 || age >= 60 || isStudent ){
            ticketPrice = 5;

        }System.out.println(ticketPrice);

        boolean action = true;
        boolean romance = true;
        boolean comedy = true;
        boolean horror = false;
        if (action && romance){
            System.out.println("This Movie Includes action and romance");
            if (comedy || horror){
                System.out.println("This Movie Includes Comedy or horror");
            }

        }
        int ratting = 10;
        if (ratting >= 0 && ratting <= 5){
            if (ratting <=2){
                System.out.println("What was the reason for low ratting");
            }if (ratting > 2){
                System.out.println("ThankYou for your feedback");
            }
        }else {
            System.out.println("You Entered a wrong Input");
        }

        int passcode = 555;
        String coffeeType;
        if (passcode == 555){
            coffeeType = "espresso";
        }else if (passcode == 312){
            coffeeType = "Vanilla latte";
        }else if (passcode == 629){
            coffeeType = "Drip Coffee";
        }else {
            coffeeType = "Unknown";
        }
        System.out.println(coffeeType);



        int passcode1 = 100;
        String coffeeType1;
        switch (passcode1){
            case 555: coffeeType1 = "Espresso";
            break;
            case 321: coffeeType1 = "Vanilla latte";
            break;
            case 629: coffeeType1 = "Drip Coffee";
            break;
            default: coffeeType1 = "Unknown";
            break;

        }
        System.out.println(coffeeType1);





    }
}
