package main;

import java.util.*;

public class UseCase12SafetyCheck {

    static class Bogie {
        String type;
        int load;

        Bogie(String type, int load) {
            this.type = type;
            this.load = load;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC12: Safety Compliance Check ===");

        List<Bogie> bogies = List.of(
                new Bogie("Goods", 80),
                new Bogie("Goods", 120), // overload
                new Bogie("Passenger", 60)
        );

        for (Bogie b : bogies) {
            if (b.type.equals("Goods") && b.load > 100) {
                System.out.println("Overloaded bogie detected: " + b.load);
            } else {
                System.out.println("Safe bogie: " + b.load);
            }
        }
    }
}