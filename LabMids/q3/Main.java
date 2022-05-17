package LabMids.q3;

public class Main {

    public static void main (String[] args) {
        Child c1 = new Child();
        Child c2 = new Child();

        c1.run();
        c2.run();

        System.out.println("Number  of Objects Created: " + Child.objCount);

    }
}
