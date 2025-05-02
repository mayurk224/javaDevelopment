import understandingObjectOutputStream.Employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_ {
    // ObjectOutputStream is a subclass of OutputStream
    // objectOutputStream encodes java objects using the class name the object values
    // this process is called serialization



    public static void main(String[] args) {
        Employee employee = new Employee("Jack", 10000);

        String filePath = "C:\\Users\\yashk\\Desktop\\javaDevelopment\\test_file_for_ObjectOutputStream_.txt";

        // saving the employee to the disk
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(employee);
            System.out.println("Employee object written successfully");

        } catch (IOException e) {
            System.err.println("Error writing object: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
