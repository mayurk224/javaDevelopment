package Composition_Vs_Inheritance;

public class Car extends Vehicle{

    // The Car has_an Engine;
    Engine engine;

    // A Car is_a Vehicle

    public Car(int modelYear, String companyName, Engine engine) {
        super(modelYear, companyName);
        this.engine = engine;
    }

    public void StartCar(){
        System.out.println("Car Started");
    }

    @Override
    public int calculatePrice() {
        return super.calculatePrice() + 2000;
    }
}
