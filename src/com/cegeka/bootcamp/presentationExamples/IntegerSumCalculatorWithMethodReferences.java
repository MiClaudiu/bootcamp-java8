package com.cegeka.bootcamp.presentationExamples;

import java.util.stream.IntStream;

public class IntegerSumCalculatorWithMethodReferences {

    private int sum = 0;

    private int getSum() {
        return sum;
    }

    private void add(int i) {
        sum += i;
    }

    private void add(IntegerSumCalculatorWithMethodReferences s) {
        sum += s.getSum();
    }

    public static void main(String[] args) {

        int[] input = {1, 2, 3};

        System.out.println("result is: " +
                                   IntStream.of(input).collect(IntegerSumCalculatorWithMethodReferences::new,
                                                               IntegerSumCalculatorWithMethodReferences::add,
                                                               IntegerSumCalculatorWithMethodReferences::add)
                                            .getSum());
    }
}
