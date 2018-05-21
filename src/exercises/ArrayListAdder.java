package exercises;

import java.util.ArrayList;

/*Write a method that takes two ArrayLists of ints and adds them together. Be sure to take the size of the lists
into account: For example: 3 4 5 1 + 1 6 = 4 10 5 1 */

public class ArrayListAdder {
    public static void main (String[] args) {
        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(3);
        first.add(4);
        first.add(5);
        first.add(1);

        ArrayList<Integer> second = new ArrayList<Integer>();
        second.add(1);
        second.add(6);

        ArrayList<Integer> result = new ArrayList<>();

        // for loop iterations need to happen on the size of the larger loop

        int length= second.size();

        if(first.size() > second.size()) {
            length = first.size();
        }

        //scope of length first declared inside if statement. Java scope depends on position of curly brackets.
        //So therefore we removed the length variable from the if statement and put it above the if statement  and set it as a constant to check for.

        for (int i = 0; i < length; i++) {
            if(i < second.size() && i < first.size()) {

                int sum = first.get(i) + second.get(i);
                result.add(sum);
            } else if (i < first.size()){
                int sum = first.get(i);
                result.add(sum);  // or remove the prior line and use result.add(first.get(i)); when you know first is the longer array
            } else if (i < second.size()){
                result.add(second.get(i));
            }
        }
        System.out.println(result);

    }
}
