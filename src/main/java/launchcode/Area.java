package launchcode;
//package studios.areaofacircle;
import studios.areaofacircle.Circle;

import java.util.Scanner;



public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = getValidRadius(scanner);
        double area = Circle.getArea(radius);

        System.out.println("The area of the circle of radius "+radius+ " is: "+ area);

        scanner.close();

    }
    // Get a valid positive radius from user input
    public static double getValidRadius(Scanner scanner) {
        double radius = 0;

        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter a radius : ");
             String  input = scanner.next();

            try {
                radius = Double.parseDouble(input);
                if (radius < 0) {
                    System.out.println("Radius cannot be negative. Please enter a positive value.");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return radius;
    }

}










