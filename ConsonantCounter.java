package practice;

import java.util.Scanner;

public class ConsonantCounter {
    public static void main(String[] args) {
        int consonents = 0;
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        a = a.toLowerCase();

        System.out.println(a);
        for (int i = 0; i < a.length(); i++) {

            if (!(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u' || a.charAt(i) == ' ')) {
                consonents++;
            }
        }

        System.out.println("Number of Consonants in the String: " + consonents);

    }
}
