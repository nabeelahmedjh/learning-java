package LabMids.q4;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("temppp.txt"));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Checked Exception handled properly");
        }
    }

}
