public class classes {
    //In Java, a class is a blueprint or template for creating objects. It defines the properties (attributes)
    // and behaviors (methods) that the objects created from the class will have.
    // Here’s a breakdown of what a class in Java entails:
    //
    //Key Components of a Class
    //Attributes (Fields): Variables that hold the state of an object.
    //Methods: Functions that define the behavior of an object.
    //Constructors: Special methods used to initialize objects.

    // States
    private String name, color;
    private int age;
    private char sex;
    private static int id = 0;
    String publicName;

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

    // CHECK static_non_static.java file:
    // this method is just to check this below statement:
    // Non-static var cannot be accessed inside a static method
    public static void non_static_var_test(){
       // id; // this is static var
    }


    // full constructor
    // alt + insert -> constructor -> select all local var -> ok
    public classes(String name, String color, int age, char sex) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.sex = sex;
        id++;
    }

    // default constructor
    // alt + insert -> constructor -> select none -> ok
    public classes() {
        id++;
    }


    // encapsulation part
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public static int getId() {
        return id;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setSex(char newSex) {
        this.sex = newSex;
    }
}
