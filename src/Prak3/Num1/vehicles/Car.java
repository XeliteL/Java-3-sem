package Prak3.Num1.vehicles;

public class Car extends Vehicle {
    public Car() {
        super();
    }

    public Car(
            String model, String license, String color, int year,
            String ownerName, int insuranceNumber, String engineType
    ) {
        super(model, license, color, year, ownerName,
                insuranceNumber, engineType);
    }

    @Override
    public String vehicleType() {
        return "Car";
    }
}