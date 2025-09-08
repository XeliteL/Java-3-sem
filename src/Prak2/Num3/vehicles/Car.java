package Prak2.Num3.vehicles;

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

    @Override
    public String toString() {
        return "Model: " + getModel() + "\nLicense: " + getLicense() +
                "\nColor: " + getColor() + "\nYear: " + getYear() +
                "\nOwner name: " + getOwnerName() + "\nInsurance number: " +
                getInsuranceNumber() + "\nEngine type: " + getEngineType();
    }
}