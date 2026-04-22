package main;

import java.util.*;
import java.util.stream.*;

public class UseCase13Performance {

    public static void main(String[] args) {

        System.out.println("=== UC13: Performance Comparison ===");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 1000000; i++) {
            numbers.add(i);
        }

        // Loop approach
        long start1 = System.currentTimeMillis();

        int sum1 = 0;
        for (int n : numbers) {
            sum1 += n;
        }

        long end1 = System.currentTimeMillis();

        // Stream approach
        long start2 = System.currentTimeMillis();

        int sum2 = numbers.stream().mapToInt(Integer::intValue).sum();

        long end2 = System.currentTimeMillis();

        System.out.println("Loop sum: " + sum1 + " Time: " + (end1 - start1));
        System.out.println("Stream sum: " + sum2 + " Time: " + (end2 - start2));
    }
}