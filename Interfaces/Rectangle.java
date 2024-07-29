package Interfaces;

//public class Rectangle extends Shape{ // previous class
    public class Rectangle implements Shape{
    private int height, width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculatePerimeter() {
        return (height + width) * 2;
    }
}
