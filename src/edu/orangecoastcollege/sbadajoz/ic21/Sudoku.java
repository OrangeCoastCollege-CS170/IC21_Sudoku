package edu.orangecoastcollege.sbadajoz.ic21;
/*
Badajoz, Seve
CS A170
November 16, 2016

IC21
 */

import java.util.Scanner;

public class Sudoku
{
    public static final int[][] initialPuzzle = {

            { 9, 0, 0, 8, 0, 5, 0, 0, 6 },

            { 1, 0, 3, 0, 0, 0, 5, 0, 4 },

            { 0, 6, 0, 0, 2, 0, 0, 7, 0 },

            { 0, 0, 7, 1, 0, 8, 6, 0, 0 },

            { 4, 0, 0, 0, 0, 0, 0, 0, 9 },

            { 0, 0, 9, 7, 0, 3, 1, 0, 0 },

            { 0, 9, 0, 0, 1, 0, 0, 6, 0 },

            { 3, 0, 2, 0, 0, 0, 4, 0, 7 },

            { 5, 0, 0, 3, 0, 2, 0, 0, 1 }

    };
    public static final int[][] solvedPuzzle = {

            { 9, 7, 4, 8, 3, 5, 2, 1, 6 },

            { 1, 2, 3, 9, 6, 7, 5, 8, 4 },

            { 8, 6, 5, 4, 2, 1, 9, 7, 3 },

            { 2, 3, 7, 1, 9, 8, 6, 4, 5 },

            { 4, 8, 1, 2, 5, 6, 7, 3, 9 },

            { 6, 5, 9, 7, 4, 3, 1, 2, 8 },

            { 7, 9, 8, 5, 1, 4, 3, 6, 2 },

            { 3, 1, 2, 6, 8, 9, 4, 5, 7 },

            { 5, 4, 6, 3, 7, 2, 8, 9, 1 }

    };
    public static final int ROWS = 9;
    public static final int COLS = 9;            
    public static int[][] workingPuzzle = new int[ROWS][COLS];

    public static void resetPuzzle() {
        for(int i = 0; i < ROWS; i++) {
            for(int y = 0; y < COLS; y++) {
                workingPuzzle[i][y] = initialPuzzle[i][y];
            }
        }
    }
    public static void printPuzzle() {
        System.out.println("  C 1  2  3  4  5  6  7  8  9");
        System.out.println("R  --------------------------");
        for(int i = 0; i < ROWS; i++) {
            System.out.print((i + 1) + "  |");
            for(int y = 0; y < COLS; y++) {
                System.out.print(((workingPuzzle[i][y] != 0)? workingPuzzle[i][y]:".") + "  ");
            }
            System.out.println();
        }
    }
    public static boolean gameIsWon() {
        for(int i = 0; i < ROWS; i++) {
            for(int y = 0; y < COLS; y++) {
                if(workingPuzzle[i][y] != initialPuzzle[i][y]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        int row, col, value;
        boolean active = true;

        resetPuzzle();
        System.out.println("Sodoku Game:\nThe puzzle is:");
        while(active){
            printPuzzle();
            System.out.println("\nWhat would you like to do?\nSet a square (S), Reset Puzzle (R) or Quit (Q)");
            userInput = input.nextLine();
            switch(userInput.toUpperCase().charAt(0)){
                case('S'):
                    System.out.println("Which row (1-9) and column (1-9) do you want to change?");
                userInput = input.nextLine();
                row = userInput.charAt(0);
                col = userInput.charAt(2);
                System.out.println("What should the value (1-9) be?");
                value = input.nextInt();
                workingPuzzle[row][col] = value;
                break;
                case('R'):
                    resetPuzzle();
                break;
                case('Q'):
                    System.out.println("Quiter...");
                System.exit(0);
                break;
            }
            active = !gameIsWon();
        }
        if(gameIsWon())
            System.out.println("You won Soduku!");
    }
}
