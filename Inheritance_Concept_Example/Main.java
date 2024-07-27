package Inheritance_Concept_Example;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Lawyer lawyer = new Lawyer();
        System.out.println(lawyer.getHours());

        Marketer marketer = new Marketer();
        System.out.println(marketer.getHours());

        System.out.println(lawyer.getSalary());
    }
}
