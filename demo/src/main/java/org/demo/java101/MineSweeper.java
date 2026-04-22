package org.demo.java101;

import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
    private int rowNumber, colNumber;
    private String[][] mineMap;
    private String[][] board;
    private int size;
    private int mineCount;
    private boolean isGameOver = false;

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.size = rowNumber * colNumber;
        this.mineMap = new String[rowNumber][colNumber];
        this.board = new String[rowNumber][colNumber];
        this.mineCount = size / 4;
    }

    public void run() {
        prepareGame();
        printMap(mineMap); // Geliştirici için mayınları gösterir, isterseniz kaldırabilirsiniz.
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");

        Scanner scanner = new Scanner(System.in);
        int remainingSafeCells = size - mineCount;

        while (!isGameOver) {
            printMap(board);
            System.out.print("Satır Giriniz : ");
            int r = scanner.nextInt();
            System.out.print("Sütun Giriniz : ");
            int c = scanner.nextInt();

            if (r < 0 || r >= rowNumber || c < 0 || c >= colNumber) {
                System.out.println("Koordinat sınır dışı! Lütfen tekrar deneyin.");
                continue;
            }

            if (board[r][c].equals("-")) {
                if (mineMap[r][c].equals("*")) {
                    System.out.println("Game Over!!");
                    isGameOver = true;
                } else {
                    checkMine(r, c);
                    remainingSafeCells--;
                    if (remainingSafeCells == 0) {
                        System.out.println("Oyunu Kazandınız !");
                        isGameOver = true;
                    }
                }
            } else {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
            }
        }
    }

    private void prepareGame() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                mineMap[i][j] = "-";
                board[i][j] = "-";
            }
        }

        Random rand = new Random();
        int count = 0;
        while (count < mineCount) {
            int r = rand.nextInt(rowNumber);
            int c = rand.nextInt(colNumber);
            if (!mineMap[r][c].equals("*")) {
                mineMap[r][c] = "*";
                count++;
            }
        }
    }

    private void checkMine(int r, int c) {
        int count = 0;
        for (int i = (r - 1); i <= (r + 1); i++) {
            for (int j = (c - 1); j <= (c + 1); j++) {
                if (i >= 0 && i < rowNumber && j >= 0 && j < colNumber) {
                    if (mineMap[i][j].equals("*")) count++;
                }
            }
        }
        board[r][c] = String.valueOf(count);
    }

    private void printMap(String[][] map) {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }
}
