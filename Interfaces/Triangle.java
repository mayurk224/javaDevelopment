package Interfaces;

//public class Triangle extends Shape{ // previous class
public class Triangle implements Shape{
    private double height, base, a, b, c;

    public Triangle(double height, double base, double a, double b, double c) {
        this.height = height;
        this.base = base;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        return (height * base) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
