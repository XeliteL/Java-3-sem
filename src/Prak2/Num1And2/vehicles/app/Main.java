package Prak2.Num1And2.vehicles.app;

import Prak2.Num1And2.vehicles.Car;
import Prak2.Num1And2.vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(
                "Anton", 52525252, "ICE V"
        );

        System.out.println(
                car.getOwnerName() + " " +
                        car.getInsuranceNumber() + " " + car.getEngineType() +
                        "\n" + car + "\n"
        );

        car.setOwnerName("Dima");
        car.setInsuranceNumber(81818181);
        car.setEngineType("ICE IV");

        System.out.println(
                car.getOwnerName() + " " +
                        car.getInsuranceNumber() + " " + car.getEngineType() +
                        "\n" + car + "\n"
        );

        ElectricCar electricCar = new ElectricCar(
                "Anton", 52525252,
                "electric", 52
        );

        System.out.println(
                electricCar.getOwnerName() + " " +
                        electricCar.getInsuranceNumber() + " " +
                        electricCar.getEngineType() + " " +
                        electricCar.getBatteryCapacity() + " " +
                        "\n" + electricCar + "\n"
        );

        electricCar.setOwnerName("Dima");
        electricCar.setInsuranceNumber(81818181);
        electricCar.setEngineType("Electric V");
        electricCar.setBatteryCapacity(81);

        System.out.println(
                electricCar.getOwnerName() + " " +
                        electricCar.getInsuranceNumber() + " " +
                        electricCar.getEngineType() + " " +
                        electricCar.getBatteryCapacity() + " " +
                        "\n" + electricCar + "\n"
        );
    }
}