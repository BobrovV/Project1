package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        /*Predicate<String> a = (s) -> s.startsWith("The");
        System.out.println(a.test("The fsfdfs"));
        System.out.println(a.test("he fsfdfs"));*/

        Function<String,Integer> addFive=s -> Integer.parseInt(s) + 5;
        System.out.println(addFive.apply("20"));
        List<Integer> collect = Arrays.stream("1,2,3,4,5,6,7".split(","))
                .filter(s -> Integer.parseInt(s) % 2 == 0)
                .map(s -> Integer.parseInt(s) * 2)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
