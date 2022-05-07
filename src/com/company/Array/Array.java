package com.company.Array;

public class Array {
    /* 24. Write a Java program to find a missing number in an array. */

    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,3,4,6,7};
        System.out.println(getMissing(numbers));

        }
    public static int getMissing(int[] numbers){
        int total_num;
        total_num = 7;
        int missing;
        int expected_num_sum = total_num * ((total_num + 1) / 2);
        int num_sum = 0;
        for (int i: numbers) {
            num_sum += i;
        }
        missing = expected_num_sum - num_sum;
        return missing;
    }
}

