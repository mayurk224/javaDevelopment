package Inheritance_Concept_Example;

public class Lawyer extends Employee{
    private char lawyerPosition;
    private String name;

    public char getLawyerPosition() {
        return 'm';
    }

    public Lawyer(String newName){
        this.name = newName;
    }

    // increase salary by 500 on original salary

    @Override
    public double getSalary() {
        return super.getSalary() + 500;
    }

    public Lawyer() {
    }
}
