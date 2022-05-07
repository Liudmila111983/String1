package com.company.Array;

import java.util.Arrays;

public class Array2 {
    //Write a Java program to sum values of an array.
    public static void main(String[] args) {
        int my_array[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(getSum(my_array));
    }
    public static int getSum(int [] my_array){
        int sum = 0;

        for (int i : my_array)
            sum += i;
        return sum;

    }


}
