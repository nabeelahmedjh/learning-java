package LabMids.q3;

public class Child extends AbstractClassDemo{

    // demo for abstract class in action
    public void run() {
        System.out.println("Child Class is Running");
    }


    // static variables: these variables doesn't belongs to the object but it belongs to the
    // class
    public static int objCount = 0;

    public Child() {
        objCount++;
    }
}
