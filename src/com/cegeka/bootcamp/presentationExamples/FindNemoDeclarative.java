package com.cegeka.bootcamp.presentationExamples;


import java.util.Arrays;
import java.util.List;

public class FindNemoDeclarative {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

        boolean nemoFound = findNemo(names);
        ResultPrinter.print(nemoFound);
    }

    private static boolean findNemo(List<String> names) {
        return names.contains("Nemo");
    }

}