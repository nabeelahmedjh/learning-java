package RPS_game;


import java.util.HashMap;

public class Player {
    private static String[] gameEntries = {"rock", "paper", "scissor"};


    private static int generateEntry() {
        return ((int)(Math.random() * 100)) % 3 + 1;
    }


    public static int winCheck(int userEntry) {


        int botEntry = Player.generateEntry();
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

}
