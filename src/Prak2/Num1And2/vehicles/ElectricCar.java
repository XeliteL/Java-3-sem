package Prak2.Num1And2.vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar() {
        super(); // вызов конструктора родительского класса
        this.engineType = "Electric";
        this.batteryCapacity = 0;
    }

    public ElectricCar(
            String ownerName, int insuranceNumber,
            String engineType, int batteryCapacity
    ) {
        super(); // вызов конструктора родительского класса
        this.batteryCapacity = batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return this.batteryCapacity;
    }

    @Override
    public String toString() {
        return "Owner name: " + getOwnerName() +
                "\nInsurance number: " + getInsuranceNumber() +
                "\nEngine type: " + getEngineType() +
                "\nBattery capacity: " + this.batteryCapacity;
    }
}
