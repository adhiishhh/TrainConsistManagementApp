package main;

import java.util.Arrays;

public class UseCase17TrainConsistMgmt {

    public static void main(String[] args) {

        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General"};

        Arrays.sort(bogies);

        System.out.println(Arrays.toString(bogies));
    }
}