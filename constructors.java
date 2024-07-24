public class constructors {
    // constructor: this constructor simply initializes all fields of the object with their default values.

    // A constructor is a special method used to initialize objects.
    // It is called when an instance of a class is created.
    // Constructors have the same name as the class and do not have a return type, not even void.

    // Key Points about Constructors
    // Initialization: Constructors are used to set initial values for object attributes.
    // No Return Type: Constructors do not return any value.
    // Same Name as Class: The constructor’s name must match the class name.
    // Called Automatically: Constructors are called automatically when an object is created.

    // this var & method are copied from classes.java file
    // States
//    String name, color;
//    int age;
//    char sex;

    // Behaviours = Methods
    // Method: is a block of code which only runs when it gets call.
//    public void Eating(){
//        System.out.println("Eating");
//    }
//
//    public void Drinking(){
//        System.out.println("Drinking");
//    }
//
//    public void Running(){
//        System.out.println("Running");
//    }



    // full constructor
    // alt + insert -> constructor -> select all local var -> ok
//    public constructors(String name, String color, int age, char sex) {
//        this.name = name;
//        this.color = color;
//        this.age = age;
//        this.sex = sex;
//    }

    // default constructor
    // alt + insert -> constructor -> select none -> ok
//    public constructors() {
//    }


    public static void main(String[] args) {
        // creating an object with defaulted (empty) constructor
        // in default or empty constructor, String is null, int is 0, boolean is false
        classes stu = new classes();
        System.out.println(stu.name);

        // creating an object with all values to the constructor
        classes stu2 = new classes("Mayur","asian",24,'m');
        System.out.println(stu2.name);
    }
}
