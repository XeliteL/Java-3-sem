package Prak3.Num2.bikeproject.src.bikeproject;

public class BikeDriver {

    public static void main(String[] args) {

        RoadBike bike1 = new RoadBike();
        RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);
        MountainBike bike3 = new MountainBike();
        Bike bike4 = new Bike();

        bike1.printDescription();
        bike2.printDescription();
        bike3.printDescription();
        bike4.printDescription();

        // 8. Обновление высоты столба для bike1 до 20 вместо 22
        System.out.println("\n=== ОБНОВЛЕНИЕ ВЫСОТЫ СТОЛБА ДЛЯ BIKE1 ===");
        bike1.setPostHeight(20);

        // 9. Вывод значений bike1 для подтверждения изменения
        System.out.println("Обновленная информация о bike1:");
        bike1.printDescription();

        // Дополнительная демонстрация работы с интерфейсами
        System.out.println("\n=== ДОПОЛНИТЕЛЬНАЯ ИНФОРМАЦИЯ ===");
        System.out.println("Производитель всех велосипедов: " + BikeParts.companyCreated);
        System.out.println("Тип местности для горного велосипеда: " + MountainParts.terrain);
        System.out.println("Тип местности для шоссейного велосипеда: " + RoadParts.terrain);
    }
}