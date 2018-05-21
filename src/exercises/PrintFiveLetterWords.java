package exercises;

/*Write a static method to print out each word
in a list that has exactly 5 letters.
*/

import java.util.ArrayList;

public class PrintFiveLetterWords {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("fiver");
        wordList.add("element");
        wordList.add("treaty");
        wordList.add("alice");
        wordList.add("slick");

        for (String word : wordList){
            if (word.length() == 5){
                System.out.println(word);
            }
        }
    }



}
