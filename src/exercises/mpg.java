package exercises;
import java.util.Scanner;

/*Write a program that asks a user for the number of miles they have driven
and the amount of gas they've consumed (in gallons), and print their miles-per-gallon.
 */

public class mpg {
    public static void main(String[] args) {
        Scanner distance = new Scanner(System.in);
        System.out.println("How many miles have you traveled?");
        double miles = distance.nextDouble();
        Scanner gas = new Scanner(System.in);
        System.out.println("How many gallons of gas have you used?");
        double gallons = gas.nextDouble();
        double milespergallon = miles/gallons;
        System.out.println("Your mpg is " + milespergallon);
    }
}
