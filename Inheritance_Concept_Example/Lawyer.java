package Inheritance_Concept_Example;

public class Lawyer extends Employee{
    private char lawyerPosition;

    public char getLawyerPosition() {
        return 'm';
    }

    // increase salary by 500 on original salary

    @Override
    public double getSalary() {
        return super.getSalary() + 500;
    }
}
