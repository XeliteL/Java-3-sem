package Prak2.Num3.vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar() {
        super();
        this.engineType = "Electric";
        this.batteryCapacity = 0;
    }

    public ElectricCar(
            String model, String license, String color,
            int year, String ownerName, int insuranceNumber,
            String engineType, int batteryCapacity
    ) {
        super(model, license, color, year, ownerName,
                insuranceNumber, engineType);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "ELectric car";
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBattery capacity: " + this.batteryCapacity;
    }
}