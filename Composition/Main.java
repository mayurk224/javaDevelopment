package Composition;

public class Main {

    // Inheritance: is used to implement the "is-a" relationship
    // Composition: is used to implement the "has-a" relationship

    public static void main(String[] args) {
        Point point = new Point(6,5);
        Circle circle = new Circle(point,10);

        System.out.println(circle.calculateArea());
    }
}
