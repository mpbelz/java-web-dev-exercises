package org.launchcode.java.Lecture1Studio;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        try {
            double radius = input.nextDouble();
            double areaCircle = Circle.getArea(radius);
            System.out.println("The area of a circle with a radius of "+ radius + " is: " + areaCircle);
        }
        catch(Exception e) {
            System.err.println("Try again, wrong type.");
        }
        input.close();
}
}
