package Inheritance_Concept_Example;

public class Marketer extends Employee{
    private boolean insideMarket;

    public boolean isInsideMarket() {
        return true;
    }

    // change working hours from 40 to 50 :

    @Override
    public int getHours() {
        return 50;
    }
}
