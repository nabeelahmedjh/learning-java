import java.util.Scanner;

public class CashCs50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cents, change = 0;

        while (true) {
            System.out.print("Change owed: ");
            cents = scan.nextInt();
            if (cents > 0)
                break;
        }
        scan.close();
        while (cents > 0) {

            if (cents >= 25)
                cents -= 25;
            else if (cents >= 10)
                cents -= 10;
            else if (cents >= 5)
                cents -= 5;
            else
                cents -= 1;

            change++;

        }
        System.out.println("Change owed: " + change);
    }

}
