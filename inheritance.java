public class inheritance {
    // Inheritance allows you to share code between classes to reduce the redundancy
    // and let you create different classes of an object in the same way

    // In Java, It is possible to inherit attributes and methods from one class to another.
    // We group the inheritance concept into two categories:
    // subclass(child) the class that inherit from another class
    // superclass(parent) the class being inherited from

    // To inherit from a class use the extent keyword

    // Why and When to use "Inheritance"?
    // It is useful for code reusability: reuse attributes and method of an
    // existing class when you create a new class

    // ex: the car class(subclass) inherits the attributes and methods from the vehicle class(parent)
    // Vehicle.java
    // public class Vehicle{
    // protected String brand = "Ford";
    // public void horn(){
    // sout("BEEP BEEP");
    // }
    // }

    // Car.java
    // public class Car extends Vehicle{
    // private String modelName = "Mustang";
    // psvm(String[] args){
    // Car mycar = new Car(); // creating object of the class car
    // mycar.horn(); // accessing horn method by class object name
    // sout(mycar.brand+""+mycar.modelName);
    // }
    // }

    // NOTE: We set brand attribute in Vehicle to a protected access modifier.
    // if it was set to private, the Car class would not be able to access it.

}
