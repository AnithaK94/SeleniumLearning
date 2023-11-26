package javaPrograms;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        // Another way of Declaration
        int[] a = new int[4]; // fixed size -= cannot add more after declaration
        a[0] = 250;
        a[1] = 450;
        a[2] = 200;
        a[3] = -150; // it allows all kinds of integers
        //a[4] = 50;//.ArrayIndexOutOfBoundsException
        System.out.println("The integer array values : " +Arrays.toString(a));

        String[] ar = {"Ross","Monica","Joey","chandler","Rachel"};
        System.out.println(ar[3]);
        System.out.println("The length of the array : " +ar.length);
        System.out.println("The valur at the last index of the array : " +ar[ar.length-1]);
        //To print all the values in the Array without using loop or list
        System.out.println("The values in the array : " + Arrays.toString(ar));
        // If we ask more than the size of the array, it will give ArrayOutOfBoxIndex Exception

    }
}
