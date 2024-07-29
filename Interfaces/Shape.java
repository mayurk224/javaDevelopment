package Interfaces;

public class Shape {

    // inheritance = is used to implement "is_a" relationship
    // composition = is used to implement "has_a" relationship


    // here, inheritance (means code sharing) isn't useful in this case,
    // because each class implements its behavior differently.


    // Shapes      Area         Perimeter
    // Circle      pi*r*r       2*pi*r
    // Rectangle   l*w          (l+w)*2
    // Triangle    h*w/2        a+b+c  (addition of all sides)


    // since there is no common in between these 3 shapes in terms
    // of calculating area and perimeter

    // since no code is sharing among these classes, hence we cannot create
    // a common superclass to represent, There is a relationship.

    // that why we cant use below methods to calculate their area & perimeter:
    // public double calculateArea(){...};
    // public double calculatePerimeter(){...};
}
