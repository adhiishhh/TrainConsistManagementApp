package main;

import java.util.*;
import java.util.stream.*;

public class UseCase9GroupBogies {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC9: Group Bogies by Type ===");

        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70),
                new Bogie("AC Chair", 60)
        );

        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        grouped.forEach((type, list) -> {
            System.out.println(type + " -> ");
            for (Bogie b : list) {
                System.out.println("   " + b.capacity);
            }
        });
    }
}