import java.nio.Buffer;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class UserGreet {

    public static void main(String[] args) {
        // Program calculator

        Scanner scan = new Scanner(System.in);

        int num1, num2;
        String op;
        System.out.println("a: ");
        num1 = scan.nextInt();
        System.out.println("b: ");
        num2 = scan.nextInt();

        System.out.println("OP: ");
        op = scan.next();

        scan.close();

        switch (op) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println((float) num1 / num2);
                break;
        }
    }
}
