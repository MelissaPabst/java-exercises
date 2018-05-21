package org.launchcode.java.demos.java4python.methods;

public class ArrayMaxFinder {
    public static int findMax(int[] array) {
        int max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static void main (String[] args) {
        int[] x = {-4, -9, 15, 35, 900, 901, 0}; // or int[] x = new int[10] if you don't know the values for the array
        int answer = findMax(x);
        System.out.println(answer);
    }
}
