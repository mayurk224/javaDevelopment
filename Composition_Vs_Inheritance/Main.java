package Composition_Vs_Inheritance;

public class Main {
    public static void main(String[] args) {
        // Inheritance: is_a relationship
        // Composition: has_a relationship

        Engine engine = new Engine(2018, "Benz");
        Car car = new Car(2021,"Mercedes",engine);
        // the above Car object is a COMPOSITION of modelYear, companyName & engine

        System.out.println(car.engine.setMaxRotation());
        System.out.println(car.calculatePrice());
        System.out.println(car.engine.getProductionYear());
    }
}
