import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("String: ");
        String userInput = scan.nextLine();
        System.out.print("To Replace: ");
        String toReplace = scan.next();

        System.out.print("New Value: ");
        String newValue = scan.next();
        System.out.println(userInput.replaceAll(toReplace, newValue));

        scan.close();
    }
}
