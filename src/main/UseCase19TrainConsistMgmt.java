package main;

import java.util.Arrays;

public class UseCase19TrainConsistMgmt {

    public static void main(String[] args) {

        String[] bogies = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Ensure sorted
        Arrays.sort(bogies);

        String key = "BG309";

        int low = 0;
        int high = bogies.length - 1;

        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogies[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found)
            System.out.println("Bogie Found");
        else
            System.out.println("Bogie Not Found");
    }
}