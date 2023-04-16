package com.lambda;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExamples {

    public Set<String> listToSEt (List<String> strings) {
        Set<String> stringsSet = strings.stream().collect(Collectors.toSet());
        return stringsSet;
    }

    public List<String> mapToList (List<String> strings){
        List<String> upperCaseStrings = strings.stream()
                .map(String :: toUpperCase)
              //ose   .map(s-> s.toUpperCase())
                .collect(Collectors.toList());
         return upperCaseStrings;
    }

    public List<String> useFlatMap (List<String> sentences){

        Stream<String> words = sentences.stream()
                .flatMap(s -> Stream.of(s.split(" ")));

        return words.collect(Collectors.toList());
    }

    public List<Integer> filterNumbers(List<Integer> numbers){
        List<Integer> evenNumbers = numbers.stream()
                .filter(n-> n%2==0)
                .collect(Collectors.toList());
        return evenNumbers;
    }

    public void printList(List<Object> objects){
        objects.forEach(System.out :: println);
    }

    public List<Integer> sortList (List<Integer> numbers){

        List<Integer> sortedNUmbers = numbers.stream()
                .sorted().collect(Collectors.toList());
        return sortedNUmbers;
    }

    public int getMin (List<Integer> numbers){

        int min = numbers.stream()
                .min(Integer :: compareTo).get();
        return min;
    }
    public int getMax (List<Integer> numbers){
        int max = numbers.stream()
                .max(Integer :: compareTo).get();
        return max;
    }

    public boolean checkIfAllMatch (List<String> strings, String string){

        boolean allStartWithJ =strings.stream().allMatch(s -> s.startsWith(string));
        return allStartWithJ;
    }

    public boolean checkIfANy (List<String> strings, String string){

        boolean anyStartsWithJ = strings.stream().anyMatch(s -> s.startsWith(string));
        return anyStartsWithJ;
    }

    public String findFirstWord (List<String> strings, String string){
        String found = strings.stream()
                .filter(s -> s.startsWith(string))
                .findFirst().orElse("Null");
        return found;
    }

    public String findAnyWord (List<String> strings, String string){
        String found =strings.stream()
                .filter(s -> s.startsWith(string))
                .findAny().orElse("NULL");
        return found;
    }
}

