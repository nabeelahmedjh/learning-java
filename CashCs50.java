import java.util.Scanner;

public class CashCs50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float dollar = 0f;

        while (true) {
            System.out.print("Change owed: ");
            dollar = scan.nextFloat();
            if (dollar > 0)
                break;
        }
        scan.close();
        float cents = dollar * 100;

        while (cents > 0) {

        }
    }

}
