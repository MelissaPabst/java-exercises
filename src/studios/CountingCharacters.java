package studios;

import java.util.HashMap;

/* Write a program that calculates the number of times each character occurs in a string
and prints these counts to the console. You could get the string as input from the user,
but for the sake of simplicity, you may also hard-code the string into your program as the value of a variable.
*/

public class CountingCharacters {
    public static void main(String[] args){
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        char[] charInText = text.toCharArray();
        HashMap<Character, Integer> counts = new HashMap<>();

        for(int i = 0; i < charInText.length; i++) {
            if(!counts.containsKey(charInText[i])) {
                counts.put(charInText[i], 1);
            } else {
                counts.put(charInText[i], counts.get(charInText[i]) + 1);
            }
        }

        System.out.println(counts.toString());


    }
}
