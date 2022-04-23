package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GameMechanism game = new GameMechanism();
        int userEntry, botEntry;
        System.out.println("Welcome to Rock-Paper-scizzer Game");
        System.out.println("1 - rock\n2 - paper\n3 - Scizzer");
        userEntry = game.chooseEntry();
        botEntry = game.generateEntry();
        System.out.println(game.getEntry(botEntry));
        System.out.println(game.winCheck(userEntry, botEntry));

    }
}
