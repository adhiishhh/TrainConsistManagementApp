package main;
public class UseCase16TrainConsistMgmt {

    public static void main(String[] args) {

        int[] capacities = {72, 56, 24, 70, 60};

        // Bubble Sort
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - 1 - i; j++) {

                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Print sorted
        for (int c : capacities) {
            System.out.print(c + " ");
        }
    }
}