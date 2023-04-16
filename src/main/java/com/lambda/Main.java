package com.lambda;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       LambdaExamples lambdaExamples = new LambdaExamples();

        List<String> names =Arrays.asList("John","Jane","Jim","Joan","Jonatan");

        lambdaExamples.printList(Collections.singletonList(names));
        Set<String> output= lambdaExamples.listToSEt(names);
        lambdaExamples.printList(Arrays.asList(output.toArray()));
        System.out.println( lambdaExamples.mapToList(names));
        boolean isAllMatch = lambdaExamples.checkIfAllMatch(names,"J");
        System.out.println(isAllMatch);








    }

}