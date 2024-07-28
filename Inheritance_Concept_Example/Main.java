package Inheritance_Concept_Example;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Lawyer lawyer = new Lawyer();
        System.out.println(lawyer.getHours());

        Marketer marketer = new Marketer();
        System.out.println(marketer.getHours());

        System.out.println(lawyer.getSalary());

        Lawyer l1 = new Lawyer("john"); // 'Lawyer l1' is reference & 'new Lawyer("john")' is a value of object
        Lawyer l2 = new Lawyer("john"); // 'Lawyer l2' is reference & 'new Lawyer("john")' is a value of object
        Lawyer l3 = l2;                          // 'Lawyer l3' is reference & it refers or assign the l2 object value

        // comparing the reference of the object
        // == checks the reference of an object
        System.out.println(l3 == l2);
        System.out.println(l2 == l3); // True because l3 assign same value of an object, of l2
        System.out.println(l1 == l2); // False because references are pointing to two different values of an object

        // comparing the objects states
        System.out.println(l3.equals(l2));
    }
}
