public class Inheritance {
    public static void main(String args[]) {

        // by accessing parent we only get access of parent class
        Parent name1 = new Parent();
        System.out.println(name1.son);

        // same as above example but here we are using the constructor
        // of child class but scope remains only in parent because
        // we are making the object of parent class
        Parent name2 = new Child();
        System.out.println(name2.son);

        // by accessing child we get access to parent as well
        Child name3 = new Child();
        System.out.println(name3.SonOfSon);
    }
}

class Parent {
    String son = "Maqsood Ahmed";
}

class Child extends Parent {
    String SonOfSon = "Nabeel";
}
