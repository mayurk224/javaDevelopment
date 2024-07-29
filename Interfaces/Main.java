package Interfaces;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5,5,10);
        Shape rect = new Rectangle(5,10);
        Shape tri = new Triangle(10,15,10,10,15);

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        System.out.println(rect.calculateArea());
        System.out.println(rect.calculatePerimeter());

        System.out.println(tri.calculatePerimeter());
        System.out.println(tri.calculateArea());
    }
}
