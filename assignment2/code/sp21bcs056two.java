import java.util.Scanner;

abstract class CheckNumber {
    public abstract boolean checkPrime(int num);

    public abstract boolean checkOdd(int num);
}

class ArmstrongNumber extends CheckNumber {

    public boolean checkOdd(int num) {
        return num % 2 != 0;
    }

    public boolean checkPrime(int num) {
        boolean prime = true;

        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        } else {
            prime = false;
        }

        return prime;
    }

    public boolean isArmstrongNumber(int num) {
        int sum = 0;
        int numCopy = num;
        while (numCopy != 0) {
            sum += Math.pow(numCopy % 10, 3);
            numCopy /= 10;

        }
        return (sum == num);
    }
}

public class sp21bcs056two {
    public static void main(String[] args) {
        ArmstrongNumber s = new ArmstrongNumber();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Integer: ");
        int num = scan.nextInt();
        System.out.println("Number is Odd: " + s.checkOdd(num));
        System.out.println("Number is Armstrong: " + s.isArmstrongNumber(num));
        System.out.println("Number is Prime: " + s.checkPrime(num));
        scan.close();

    }
}
