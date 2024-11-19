package com.epam.mjc;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        Stream<Integer> evenNumbers = list.stream().filter(number -> number % 2 == 0);
        return evenNumbers.collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        Stream<String> inUpperCase = list.stream().map(String::toUpperCase);
        return inUpperCase.collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compareTo);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
         return list.stream().flatMap(List::stream).min(Integer::compareTo);
    }

    public Integer sum(List<Integer> list) {
        Optional<Integer> res = list.stream().reduce(Integer::sum);
        return res.orElse(null);
    }
}
