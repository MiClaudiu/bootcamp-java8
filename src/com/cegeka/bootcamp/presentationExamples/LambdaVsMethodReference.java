package com.cegeka.bootcamp.presentationExamples;

import java.util.function.Consumer;

public class LambdaVsMethodReference {

    public static void main(String[] args) {


        Consumer<String> c1 = s -> System.out.println(s);


        Consumer<String> c2 = System.out::println;


        c1.accept("s");
        c2.accept("s");
    }
}
