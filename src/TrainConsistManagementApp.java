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
    }
}