package Composition;

public class Circle{
    // a circle consist of point and radius

    // class name can be used as an attribute
    Point center;
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}
