package exercises;

import java.util.Scanner;

public class calculateMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of miles driven : ");
        Double miles = input.nextDouble();

        System.out.println("Enter the amount of gas consumed in gallons : ");
        Double gas = input.nextDouble();

        Double mileage = miles/gas;
        System.out.println("The mileage is "+ mileage +" miles per gallon");
    }
}
