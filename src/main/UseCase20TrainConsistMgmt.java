package main;

public class UseCase20TrainConsistMgmt {

    public static void main(String[] args) {

        String[] bogies = {}; // empty array

        // ❗ Fail-fast check
        if (bogies.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // This will not execute if empty
        String key = "BG101";

        for (String b : bogies) {
            if (b.equals(key)) {
                System.out.println("Found");
                return;
            }
        }

        System.out.println("Not Found");
    }
}
