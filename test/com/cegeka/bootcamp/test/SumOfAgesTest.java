package com.cegeka.bootcamp.test;

import com.cegeka.bootcamp.exercise.SumOfAges;
import com.cegeka.bootcamp.exercise.common.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.cegeka.bootcamp.exercise.common.Gender.FEMALE;
import static com.cegeka.bootcamp.exercise.common.Gender.MALE;
import static org.junit.Assert.assertEquals;

public class SumOfAgesTest {

    @Test
    public void test1() {
        List<Person> people = Collections.emptyList();

        int result = getResult(people);
        assertEquals(0, result);
    }

    @Test
    public void test2() {
        List<Person> people = Arrays.asList(new Person(20, MALE),
                                            new Person(22, FEMALE));

        int result = getResult(people);
        assertEquals(20, result);
    }

    @Test
    public void test3() {
        List<Person> people = Arrays.asList(new Person(20, FEMALE),
                                            new Person(22, FEMALE),
                                            new Person(30, FEMALE));

        int result = getResult(people);
        assertEquals(0, result);
    }

    @Test
    public void test4() {
        List<Person> people = Arrays.asList(new Person(20, MALE),
                                            new Person(22, MALE),
                                            new Person(30, MALE));

        int result = getResult(people);
        assertEquals(42, result);
    }

    @Test
    public void test5() {
        List<Person> people = Arrays.asList(new Person(33, MALE),
                                            new Person(44, MALE),
                                            new Person(55, MALE));

        int result = getResult(people);
        assertEquals(0, result);
    }

    private int getResult(List<Person> people) {
        return SumOfAges.calculateSumOfAgesForMalesYoungerThan25(people);
    }

}
