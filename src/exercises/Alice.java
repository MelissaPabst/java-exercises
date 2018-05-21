package exercises;

import java.util.Scanner;

/* The first sentence of Alice's Adventures in Wonderland is below. Store this sentence in a string,
and then prompt the user for a term to search for within this string. Print whether or not the search term was found.
See if you can make the search case-insensitive, so that searching for "alice", for example, prints true.
 */

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search term and I'll tell you if it is located within the first sentence of 'Alice in Wonderland'");
        String search = input.next();
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, \'and what is the use of a book,\' thought Alice \'without pictures or conversation?";
            if (sentence.toLowerCase().contains(search.toLowerCase())) {
                System.out.println("True. Your term '" + search + "' was in the sentence.");
            }
            else {
                System.out.println("False. Your term '" + search + "' was not in the sentence.");
            }
    }
}
