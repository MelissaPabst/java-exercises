package studios;

import java.util.Scanner;

/* Write a program/class Area that prompts the user for a number,
and then calculate the area of a circle with that radius and print the result.
 */

public class Area {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a radius to find the area of a circle.");
        double r = s.nextDouble();

        double area  = Math.PI * r * r;
        System.out.println("The area of the circle is: " + area);

    }
}
