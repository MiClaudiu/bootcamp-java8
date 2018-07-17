package com.cegeka.bootcamp.test;

import com.cegeka.bootcamp.exercise.DivisibleInts;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DivisibleIntsTest {

    @Test
    public void test1() {
        int[] result = getResult(19502);
        assertTrue(Arrays.equals(result, new int[] {1, 2}));
    }

    @Test
    public void test2() {
        int[] result = getResult(51424);
        assertTrue(Arrays.equals(result, new int[] {1, 4, 2}));
    }

    @Test
    public void test3() {
        int[] result = getResult(877692);
        assertTrue(Arrays.equals(result, new int[] {6, 2}));
    }

    @Test
    public void test4() {
        int[] result = getResult(356724624);
        assertTrue(Arrays.equals(result, new int[] {3, 6, 2, 4}));
    }

    private int[] getResult(int number) {
        return DivisibleInts.getDivisibleInts(number);
    }

}
