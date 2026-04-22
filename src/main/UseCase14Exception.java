package main;

public class UseCase14Exception {

    // Custom Exception
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity < 0) {
                throw new InvalidCapacityException("Capacity cannot be negative");
            }
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC14: Custom Exception Handling ===");

        try {
            Bogie b1 = new Bogie("Sleeper", 72);
            Bogie b2 = new Bogie("AC", -10); // invalid

            System.out.println("Bogie created: " + b1.name);
            System.out.println("Bogie created: " + b2.name);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}