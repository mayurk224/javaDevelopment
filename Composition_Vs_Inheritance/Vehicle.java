package Composition_Vs_Inheritance;

public class Vehicle {
    private int modelYear;
    private String companyName;

    public Vehicle(int modelYear, String companyName) {
        this.modelYear = modelYear;
        this.companyName = companyName;
    }

    public int calculatePrice(){
        return 10000;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String getCompanyName() {
        return companyName;
    }
}
