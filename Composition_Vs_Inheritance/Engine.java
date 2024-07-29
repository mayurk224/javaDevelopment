package Composition_Vs_Inheritance;

public class Engine {
    private int productionYear;
    private String manufactureCompany;

    public Engine(int productionYear, String manufactureCompany) {
        this.productionYear = productionYear;
        this.manufactureCompany = manufactureCompany;
    }

    public int setMaxRotation(){
        return 1800;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getManufactureCompany() {
        return manufactureCompany;
    }
}
