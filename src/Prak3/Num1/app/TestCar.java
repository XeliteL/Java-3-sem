package Prak3.Num1.app;

import Prak3.Num1.vehicles.*;

public class TestCar {
    public static void main(String[] args) {
        //Создание объектов через класс Vehicle
        Vehicle car1 = new Car("Audi RS7", "Имеется",
                "Чёрный",2025, "Алексей",
                52525252, "ДВС");
        Vehicle elCar1 = new ElectricCar("Audi e-tron GT",
                "Имеется","Серый", 2024,
                "Никита",42424242,
                "Электрический", 93);

        //Создание объектов через класс Car
        Car car2 = new Car("Porsche Boxster 718", "Имеется",
                "Белый",2025, "Арсений",
                81818181, "ДВС");
        Car elCar2 = new ElectricCar("Porsche Taycan",
                "Имеется","Зелёный", 2023,
                "Андрей",31313131,
                "Электрический", 76);

        //Полиморфизм - вызов методов через ссылки на родительские классы
        System.out.println("Тип машины");
        display(car1);
        display(elCar1);
        display(car2);
        display(elCar2);

        System.out.println("\nИнформация о машинах");
        System.out.println(car1 + "\n");
        System.out.println(elCar2 + "\n");

        //Демонстрация сеттеров через родительские классы
        car1.setInsuranceNumber(12121212);
        car1.setColor("Серый");

        elCar2.setYear(2026);
        elCar2.setModel("Porsche Cayenne electric");

        //Вывод изменённой объектов с изменённой информацией
        System.out.println("\nОбновлённая информация о машинах");
        System.out.println(car1 + "\n");
        System.out.println(elCar2 + "\n");

        //Инкапсуляция
        System.out.println("\nИнкапсуляция");
        Vehicle[] vehicles = {car1, elCar1, car2, elCar2};

        for (Vehicle vehicle: vehicles) {
            System.out.println("Vehicle type: " + vehicle.vehicleType());
            System.out.println("Model: " + vehicle.getModel());
            System.out.println("Year: " + vehicle.getYear());
            System.out.println("Engine type: " + vehicle.getEngineType() + "\n");
        }
    }

    //Метод для демонстрации полиморфизма
    public static void display(Vehicle vehicle) {
        System.out.println("Vehicle type: " + vehicle.vehicleType());
    }
}