public class objects {
    //In Java, a class is a blueprint or template for creating objects. It defines the properties (attributes)
    // and behaviors (methods) that the objects created from the class will have.
    // Here’s a breakdown of what a class in Java entails:
    //
    //Key Components of a Class
    //Attributes (Fields): Variables that hold the state of an object.
    //Methods: Functions that define the behavior of an object.
    //Constructors: Special methods used to initialize objects.

    // States
    String name, color;
    int age;
    char sex;

    // Behaviours = Methods
    // Method: is a block of code which only runs when it gets call.
    public void Eating(){
        System.out.println("Eating");
    }

    public void Drinking(){
        System.out.println("Drinking");
    }

    public void Running(){
        System.out.println("Running");
    }

    public static void main(String[] args) {
        classes stu = new classes();

        // due to making variables private in classes.java file, I comment out below line
//        stu.name = "Mayur";
//        stu.age = 24;
//        stu.sex = 'm';
//        stu.color = "Asian";

        stu.Eating();
        stu.Drinking();
        stu.Running();

        // due to making variables private in classes.java file, I comment out below line
//        System.out.println(stu.name);
//        System.out.println(stu.age);
//        System.out.println(stu.color);
    }
}
