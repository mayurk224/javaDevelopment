package understandingObjectOutputStream;

import java.io.Serializable;

public class Employee implements Serializable {
    // every class or object you need to save it to disk
    // you need to implement the serializable interface
    private static final long serialVersionUID = 1L;

    public String name;
    public int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
