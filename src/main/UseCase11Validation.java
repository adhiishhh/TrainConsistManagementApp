package main;

import java.util.regex.*;

public class UseCase11Validation {

    public static void main(String[] args) {

        System.out.println("=== UC11: Validation using Regex ===");

        String trainId = "TR123";
        String cargoCode = "CG456";

        // Train ID pattern: TR followed by 3 digits
        boolean isTrainValid = Pattern.matches("TR\\d{3}", trainId);

        // Cargo code pattern: CG followed by 3 digits
        boolean isCargoValid = Pattern.matches("CG\\d{3}", cargoCode);

        System.out.println("Train ID valid: " + isTrainValid);
        System.out.println("Cargo Code valid: " + isCargoValid);
    }
}