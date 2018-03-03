package com.company;

import java.util.List;

public class SkarbFinder {

    private int[] firstClue;
    private int[] secondClue;

    public void setCoordinates(int firstClue, int[] coordinates, int secondClue) {

        switch (firstClue){
            case 0:
                coordinates[1] += secondClue;
                break;
            case 1:
                coordinates[1] -= secondClue;
                break;
            case 2:
                coordinates[0] -= secondClue;
                break;
            case 3:
                coordinates[0] += secondClue;
                break;
        }
    }

    public void printClues(List<int[]> listOfCoordinates){
        for (int[] coordinate: listOfCoordinates){

            if (coordinate[1] != 0) {
                firstClue = new int[2];

                if (coordinate[1] > 0) {
                    firstClue[0] = 0;
                    firstClue[1] = coordinate[1];
                } else {
                    firstClue[0] = 1;
                    firstClue[1] = coordinate[1] * (-1);
                }
            }

            if (coordinate[0] != 0) {
                secondClue = new int[2];

                if (coordinate[0] > 0){
                    secondClue[0] = 3;
                    secondClue[1] = coordinate[0];
                }else {
                    secondClue[0] = 2;
                    secondClue[1] = coordinate[0]*(-1);
                }
            }

            if (coordinate[1] == 0) {
                if (coordinate[0] == 0) {
                    System.out.println("studnia");
                } else {
                    System.out.println(secondClue[0] + " " + secondClue[1]);
                }
            }else {
                if (coordinate[0] == 0) {
                    System.out.println(firstClue[0] + " " + firstClue[1]);
                } else {
                    System.out.println(firstClue[0] + " " + firstClue[1]);
                    System.out.println(secondClue[0] + " " + secondClue[1]);
                }
            }
        }
    }
}
