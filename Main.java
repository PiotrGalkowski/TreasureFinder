package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<int[]> listOfCoordinates = new ArrayList<>();
        SkarbFinder skarbFinder = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź liczbę zestawów danych:");
        int numberOfSets = scanner.nextInt();

        for (int i = 0; i < numberOfSets; i++){
            skarbFinder = new SkarbFinder();
            int[] coordinates = new int[2];

            System.out.println("Wprowadź liczbę wskazówek w " + (i+1) + " zestawie:");
            int numberOfClues = scanner.nextInt();
            System.out.println("Wprowadź poszczególne wskazówki oddzielone przecinkami:");
            for (int j = 0; j < numberOfClues; j++){
                String[] clue = scanner.next().split(",");
                int firstClue = Integer.parseInt(clue[0]);
                int secondClue = Integer.parseInt(clue[1]);

                skarbFinder.setCoordinates(firstClue, coordinates, secondClue);
            }
            listOfCoordinates.add(coordinates);
        }
        System.out.println();
        System.out.println("OTO WYNIKI:");
        System.out.println();
        skarbFinder.printClues(listOfCoordinates);
    }
}
