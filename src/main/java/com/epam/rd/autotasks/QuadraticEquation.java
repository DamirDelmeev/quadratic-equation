package com.epam.rd.autotasks;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Error on input ");
        } else {
            double discriminant = findDiscriminant(a, b, c);
            if (discriminant > 0) {
                double firstRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
                double secondRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
                System.out.print(firstRoot +" "+ secondRoot);
            }
            if (discriminant == 0) {
                double firstRoot = -b / (2 * a);
                System.out.println(firstRoot);
            }
            if (discriminant < 0) {
                System.out.println("no roots");
            }
        }
    }

    private static double findDiscriminant(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

}
