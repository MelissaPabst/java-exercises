package exercises;

import java.util.Scanner;

/* Modify your "Hello, World" program to prompt
the user for their name, and greet them by name.
 */

public class FirstClass {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("What is your name?");
       String name = in.next();
       System.out.println("Hello, " + name);
    }
}
