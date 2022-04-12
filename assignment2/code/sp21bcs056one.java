package assignment2.code;

class Shape {
    public void printShape() {
        System.out.println("This is Shape");
    }
}

class Rectangle extends Shape {
    public void printRectangle() {
        System.out.println("This is Rectangular Shape");
    }
}

class Circle extends Shape {
    public void printCircle() {
        System.out.println("This is Circular Shape");
    }
}

class Square extends Rectangle {
    public void printSquare() {
        System.out.println("Square is Rectangle");
    }
}

public class sp21bcs056one {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.printShape();
        sq.printRectangle();
    }
}
