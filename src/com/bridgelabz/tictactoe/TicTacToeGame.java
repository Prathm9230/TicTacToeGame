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
    public static void show()
    {
        System.out.println(" "+board[1]+"|"+board[2]+"|"+board[3]);
        System.out.println(" "+board[4]+"|"+board[5]+"|"+board[6]);
        System.out.println(" "+board[7]+"|"+board[8]+"|"+board[9]);
    }
    public static void ChooseLetter()//UC-2
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the letter from 'X' or 'O:");
        char letter = sc.nextLine().charAt(0);
    }

    public static void main(String[] args) {
        makeboard();
        playermove(2,'X');
        show();
        ChooseLetter();
    }
}
