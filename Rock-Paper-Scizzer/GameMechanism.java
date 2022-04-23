package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameMechanism {

    private String[] gameEntries = {"rock", "paper", "scizzer"};


    public int chooseEntry() {
        int entry;
        while(true) {

            System.out.print("Chose Your Entry: ");
            Scanner scan = new Scanner(System.in);
            try {
                entry = scan.nextInt();
                if (!(entry > 0 && entry < 4))
                    System.out.println("!!!!Entry must be (0 - 3)!!!!");
                else
                    break;

            } catch (Exception e) {
                System.out.println("Enter a valid Argument (Integer)");
            }
        }
        return entry;

    }
    public int generateEntry() {
        return ((int)(Math.random() * 100)) % 3 + 1;
    }


    public int winCheck(int userEntry, int botEntry) {

        if (userEntry == 1 && botEntry == 2)
            return -1;
        else if (userEntry == 1 && botEntry == 3)
            return 1;
        else if (userEntry == 2 && botEntry == 1)
            return 1;
        else if (userEntry == 2 && botEntry == 3)
            return -1;
        else if (userEntry == 3 && botEntry == 1)
            return -1;
        else if (userEntry == 3 && botEntry == 2)
            return 1;
        else if (userEntry == botEntry)
            return 0;
        else
            return 543;
    }

    public String getEntry(int entry) {
        return gameEntries[entry - 1];
    }
}
