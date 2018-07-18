package com.cegeka.bootcamp.presentationExamples;

public class AnonymousVsLambda {

    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world from anonymous class!");
            }
        };

        Runnable r2 = () -> System.out.println("Hello world from lambda");

        r1.run();
        r2.run();
    }
}
