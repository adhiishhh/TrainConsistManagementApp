import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("Train Consist Management App");
        System.out.println("UC1 - Initialize Train");
        System.out.println("===================================");

        // Create empty train consist
        List<String> train = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Initial bogie count: " + train.size());

        // Display current train
        System.out.println("Train consist: " + train);

        // ================= UC2 =================
        System.out.println("\n===================================");
        System.out.println("UC2 - Add Passenger Bogies");
        System.out.println("===================================");

        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After adding bogies: " + passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");

        System.out.println("After removing AC Chair: " + passengerBogies);

        // Check existence
        System.out.println("Does Sleeper exist? " + passengerBogies.contains("Sleeper"));

        // ================= UC3 =================
        System.out.println("\n===================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("===================================");

        Set<String> bogieIDs = new HashSet<>();

// Add bogie IDs (with duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

// Display unique bogies
        System.out.println("Unique Bogie IDs: " + bogieIDs);
    }
}