package exercises;

/*Make a program similar to GradebookHashMap, but which takes in students names and
ID numbers (as integers) instead of names and grades. In this case, however, the keys
should be integers (the IDs) and the values should be strings (the names).
Modify the roster printing code accordingly.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GBHashMap {

    public static void main(String[] args) {

        HashMap<String, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newID;

        System.out.println("Enter student ID's or press ENTER to finish: ");

        // Get student ID's and names
        do {

            System.out.print("Student ID: ");
            newID = input.nextLine();

            if (!newID.equals("")) {
                System.out.print("Name: ");
                String newStudent = input.next();
                students.put(newID, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newID.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");


        for (Map.Entry<String, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());

        }

    }

}
