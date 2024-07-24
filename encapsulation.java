public class encapsulation {
    // Encapsulation is a fundamental concept in object-oriented programming (OOP)
    // that involves bundling the data (variables) and the methods (functions)
    // that operate on the data into a single unit, called a class.
    // It also restricts direct access to some of an object’s components,
    // which is a means of preventing unintended interference and misuse of
    // the data.

    // Key Points of Encapsulation
    // Data Hiding: By making the data members (variables) of a class private,
    //              you can hide the internal state of the object from the outside world.
    //              This ensures that the data cannot be directly accessed or modified from
    //              outside the class.
    // Public Methods: To allow controlled access to the data, you provide
    //                 public methods (getters and setters) that can be used
    //                 to retrieve and modify the values of the private variables.


    public static void main(String[] args) {
        // check classes.java file
        classes stu = new classes("Mayur","asian",24,'m');
        classes stu2 = new classes();

        stu.setName("Yash");
        stu2.setName("Alex");
        System.out.println(stu.getName());
        System.out.println(stu2.getName());
    }

}
