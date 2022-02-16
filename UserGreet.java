import java.nio.Buffer;
import java.util.Scanner;

public class UserGreet {

    public static void main(String[] args) {
        System.out.print("Your Name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name);
        scan.close();
    }
}
