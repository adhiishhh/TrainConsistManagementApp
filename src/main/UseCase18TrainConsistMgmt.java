package main;

public class UseCase18TrainConsistMgmt {

    public static void main(String[] args) {

        String[] bogies = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchKey = "BG309";

        boolean found = false;

        for (String b : bogies) {
            if (b.equals(searchKey)) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Bogie Found");
        else
            System.out.println("Bogie Not Found");
    }
}