import understandingObjectOutputStream.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) {
        Employee employee = new Employee("Jack", 10000);

        String filePath = "C:\\Users\\yashk\\Desktop\\javaDevelopment\\test_file_for_ObjectOutputStream_.txt";

        // reading the employee from the disk

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Employee employeeRead = (Employee) objectInputStream.readObject();
            System.out.println("Employee name: " + employeeRead.name);
            System.out.println("Employee salary: " + employeeRead.salary);
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
