package com.cegeka.bootcamp.presentationExamples;

import java.util.stream.IntStream;

public class IntegerSumCalculatorWithLambdas {

    private int sum = 0;

    private int getSum() {
        return sum;
    }

    private void add(int i) {
        sum += i;
    }

    private void add(IntegerSumCalculatorWithLambdas s) {
        sum += s.getSum();
    }

    public static void main(String[] args) {

        int[] input = {1, 2, 3};

        System.out.println("result is: " +
                                   IntStream.of(input).collect(() -> new IntegerSumCalculatorWithLambdas(),
                                                               (s, i) -> s.add(i),
                                                               (s1, s2) -> s1.add(s2))
                                            .getSum());
    }
}
