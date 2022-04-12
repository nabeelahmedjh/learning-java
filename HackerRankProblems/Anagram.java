package HackerRankProblems;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        boolean notAnagram = false;
        HashMap<Character, Integer> count1 = new HashMap<>();
        HashMap<Character, Integer> count2 = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String string1 = scan.next();
        String string2 = scan.next();
        hashFunction(string1, count1);
        hashFunction(string2, count2);

        if (string1.length() != string2.length())
            notAnagram = true;
        for (int i = 0; i < string1.length(); i++) {
            if (!(count1.get(Character.toLowerCase(string1.charAt(i)))
                    .equals(count2.get(Character.toLowerCase(string1.charAt(i)))))) {
                notAnagram = true;

            }
        }

        if (notAnagram)
            System.out.println("Not Anagrams");
        else
            System.out.println("Anagrams");

    }

    public static void hashFunction(String str, HashMap<Character, Integer> map) {
        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            try {
                count = map.get(Character.toLowerCase(str.charAt(i)));
                map.put(str.charAt(i), count + 1);
            } catch (Exception e) {
                map.put(Character.toLowerCase(str.charAt(i)), 1);
            }
        }
    }

}
