package com.company.tests;

import com.company.Array.Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {
    @Test
    public void getMissing(){
        assertEquals(5, Array.getMissing(new int[]{1,2,3,4,6,7}));
    }

}