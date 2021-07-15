package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;


public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean cond = true;

        do {
            System.out.println("Enter the radius of the circle : ");
            String userInput = input.next();
            try {
                double radius = Double.parseDouble(userInput);
                if (radius < 0) {
                    continue;
                }

                Double area = Circle.getArea(radius);
                System.out.println("The area of the circle with radius " + radius + " is " + area);
                System.exit(0);

            } catch (NumberFormatException nfe) {
                System.out.println("The user input is invalid");
                System.exit(0);
            }
        } while (cond);
        input.close();
    }


}
