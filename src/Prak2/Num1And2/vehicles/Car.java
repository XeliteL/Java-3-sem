package Prak2.Num1And2.vehicles;

public class Car {
    private String ownerName;
    private int insuranceNumber;
    protected String engineType;

    public Car() {
        this.ownerName = "None";
        this.insuranceNumber= 0;
        this.engineType = "None";
    }

    public Car(
            String ownerName, int insuranceNumber, String engineType
    ) {
        this.ownerName = ownerName;
        this.insuranceNumber= insuranceNumber;
        this.engineType = engineType;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public int getInsuranceNumber() {
        return this.insuranceNumber;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return this.engineType;
    }

    @Override
    public String toString() {
        return "Owner name: " + this.ownerName +
                "\nInsurance number: " + this.insuranceNumber +
                "\nEngine type: " + this.engineType;
    }
}