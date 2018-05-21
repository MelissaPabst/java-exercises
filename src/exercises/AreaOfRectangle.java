package exercises;
import java.util.Scanner;

/* Write a program to calculate the area of a rectangle
and print the answer to the console. You should prompt the user for the dimensions.
 */

public class AreaOfRectangle {

    public static void main (String[] args){
        Scanner l = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        double length = l.nextDouble();
        Scanner w = new Scanner(System.in);
        System.out.println("What is the width of the rectangle?");
        double width = w.nextDouble();
        double area = length * width;
        System.out.println("The area of the rectangle is " + area);
    }
}
