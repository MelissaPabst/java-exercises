package studios;

import java.util.HashMap;

/* Write a program that calculates the number of times each character occurs in a string
and prints these counts to the console. You could get the string as input from the user,
but for the sake of simplicity, you may also hard-code the string into your program as the value of a variable.
*/

public class CountingCharactersDoug {

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        // construct new HashMap object
        HashMap<Character, Integer> counts = new HashMap<>();
        // turn String object into an array of characters
        char[] charactersInString = text.toCharArray();

        // enhanced "for each" loop
        // python: for c in charactersInString
        for(char c : charactersInString) {
            if(counts.containsKey(c)){
                //get value of key
                int x = counts.get(c);
                //if value of key already there, add one
                counts.put(c, x + 1);
            } else {
                //create value of 1 if value is zero
                counts.put(c, 1);
            }
        }

        counts.keySet().toArray();
        for(char k : counts.keySet()) {
            System.out.println(k + ": " + counts.get(k));
        }

    }
}
