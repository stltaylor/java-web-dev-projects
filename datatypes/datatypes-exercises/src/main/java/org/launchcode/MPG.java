package org.launchcode;
import java.util.Scanner;
public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles?");

        Double miles = input.nextDouble();
        System.out.println("How many gallons");
        Double gallons = input.nextDouble();

        System.out.println("Your mpg is " + miles / gallons);

    }
}
