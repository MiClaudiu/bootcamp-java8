package com.cegeka.bootcamp.test;

import com.cegeka.bootcamp.exercise.UpperCaseWords;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UpperCaseWordsTest {

    @Test
    public void test1() {
        List<String> words = Collections.emptyList();

        String result = getResult(words);
        assertEquals("", result);
    }

    @Test
    public void test2() {
        List<String> words = Arrays.asList("Ana", "are", "mere");

        String result = getResult(words);
        assertEquals("ANAAREMERE", result);
    }

    @Test
    public void test3() {
        List<String> words = Arrays.asList("Ana", "are", "2", "mere");

        String result = getResult(words);
        assertEquals("ANAARE2MERE", result);
    }

    @Test
    public void test4() {
        List<String> words = Arrays.asList("Ana", "are", "X", "mere");

        String result = getResult(words);
        assertEquals("ANAAREMERE", result);
    }

    @Test
    public void test5() {
        List<String> words = Arrays.asList("Ana", "are", "x", "mere");

        String result = getResult(words);
        assertEquals("ANAAREXMERE", result);
    }

    private String getResult(List<String> words) {
        return UpperCaseWords.mergeWordsAndConvertToUpperCase(words);
    }

}
