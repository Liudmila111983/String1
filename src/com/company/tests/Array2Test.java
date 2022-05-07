package com.company.tests;

import com.company.Array.Array2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Array2Test {

    @Test
    public void getSum(){
        assertEquals(55, Array2.getSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));

    }

}