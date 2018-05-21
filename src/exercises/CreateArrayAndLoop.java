package exercises;

/*Create and initialize an array with the following values
in a single line: 1, 1, 2, 3, 5, 8. Then loop through the array and print out each value.
*/


public class CreateArrayAndLoop {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 3, 5, 8};

        for(int num : nums) {
            System.out.println(num);
        }

    }
}
