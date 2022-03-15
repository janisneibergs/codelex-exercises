package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {


    private static final char[][] board = new char[3][3];

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String game = null;
        int turn = 1;

        initBoard();
        displayBoard();


        while (game == null) {
            // 'X' turn
            while (turn == 1) {
                if (filledBoard()) {
                    turn = 5;
                } else {
                    System.out.print("'X' Choose your placement (Row, Column): ");

                    int row = keyboard.nextInt();
                    int column = keyboard.nextInt();

                    if (board[row][column] == ' ') {
                        board[row][column] = 'X';
                        displayBoard();
                        checkWinner();

                        if (checkWinner()) {
                            turn = 3;
                        } else {
                            turn = 2;
                        }
                    } else {
                        System.out.println("That spot is taken try again");
                    }
                }
            }


            while (turn == 2) {

                if (filledBoard()) {
                    turn = 5;
                } else {
                    System.out.print("'O' Choose your placement (Row, Column): ");

                    int row = keyboard.nextInt();
                    int column = keyboard.nextInt();

                    if (board[row][column] == ' ') {
                        board[row][column] = 'O';
                        displayBoard();
                        checkWinner();

                        if (checkWinner()) {
                            turn = 4;
                        } else {
                            turn = 1;
                        }
                    } else if (board[row][column] == 'X' || board[row][column] == 'O') {
                        System.out.println("That spot is taken try again");
                    }
                }
            }

            if (turn == 3) {
                game = "X";
            }
            if (turn == 4) {
                game = "O";
            }
            if (turn == 5) {
                game = "Tie";
            }

        }

        if (game.equals("X")) {
            System.out.println(game + " is the Winner!");
        }

        if (game.equals("O")) {
            System.out.println(game + " is the Winner!");
        }

        if (game.equals("Tie")) {
            System.out.println("The game ended in a " + game + "!");
        }
    }

    public static void initBoard() {
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static boolean checkWinner() {
        return (checkRows() || checkCols() || checkDiag());
    }

    public static boolean threeCheck(char c1, char c2, char c3) {
        return ((c1 != ' ') && (c1 == c2) && (c2 == c3));
    }

    public static boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (threeCheck(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkCols() {
        for (int i = 0; i < 3; i++) {
            if (threeCheck(board[i][0], board[i][1], board[i][2])) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiag() {
        return ((threeCheck(board[0][0], board[1][1], board[2][2])) || (threeCheck(board[0][2], board[1][1], board[2][0])));
    }

    public static boolean filledBoard() {
        boolean full = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    full = false;
                    break;
                }
            }
        }
        return full;
    }
}