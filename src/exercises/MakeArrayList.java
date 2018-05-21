package exercises;

/*Write a static method to find the sum of all the even numbers in a list.
Within main, create a list with at least 10 integers and call your method on the list.
 */


import java.util.ArrayList;

public class MakeArrayList {
    public static void main(String[] args){
        ArrayList<Integer> theAList = new ArrayList<>();
        theAList.add(45);
        theAList.add(52);
        theAList.add(1);
        theAList.add(54);
        theAList.add(2);
        theAList.add(5);
        theAList.add(15);
        theAList.add(9);
        theAList.add(3);
        theAList.add(0);

        Integer sum = 0;
        for (Integer num: theAList) {
            if (num % 2 == 0 ) {
                sum = sum + num;
            }
        }
        System.out.println(sum);
    }

}
