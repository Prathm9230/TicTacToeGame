package com.bridgelabz.tictactoe;
import java.util.Scanner;


public class TicTacToeGame {
    static char playerLetter = 'P';
    static char CompLetter= 'C';

    private static char[] board;
    public static void makeboard()
    {
        board=new char[10];
        for(int i=1;i<10;i++)
        {
            board[i]=' ';
        }
    }
    public static void playermove(int place,char sign)
    {
        board[place]=sign;
    }
    public static void show() {
        for (int i = 1; i <= 9; i += 3) {
            System.out.println(" " + board[i] + " | " + board[i + 1] + " | " + board[i + 2]);
            if (i < 7) {
                System.out.println("---+---+---");
            }
        }
    }

    public static void ChooseLetter()//UC-2
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the letter from 'X' or 'O:");
        char letter = sc.nextLine().charAt(0);
    }
    public static void showBoard()
    {
        System.out.println("my current board is:");
        show();//UC-3
    }

    public static void main(String[] args) {
        makeboard();
        playermove(2,'X');
        show();
        ChooseLetter();
    }
}
