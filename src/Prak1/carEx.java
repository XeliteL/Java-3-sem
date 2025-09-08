package Prak1;

class Car {
    public String model;
    public String license;
    public String color;
    public int year;
    public static int nowYear = 2025;

    public Car(String model, String license,
               String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car() {
        this.model = "Audi RS6 IV C8 avant GT";
        this.license = "Есть";
        this.color = "Белый";
        this.year = 2023;
    }

    public Car(String model, String color, int year) {
        this.model = model;
        this.license = "Отсутствует";
        this.color = color;
        this.year = year;
    }

    public String To_String() {
        String output;

        output = "Модель: " + this.model;
        output += "\nЛицензия: " + this.license;
        output += "\nЦвет: " + this.color;
        output += "\nГод: " + this.year + "\n";

        return output;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return this.model;
    }

    public String getLicense() {
        return this.license;
    }

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public int autoAge() {
        return nowYear - this.year;
    }
}

public class carEx {
    public static void main(String[] args) {
        Car Skoda = new Car("Skoda Octavia RS IV A8",
                "Есть","Тёмно-зелёный", 2022);
        System.out.println(Skoda.To_String());

        Car Audi = new Car();
        System.out.println(Audi.To_String());

        Car Porsche = new Car("Porcshe 911 992 GT3RS",
                "Белый",2024);
        System.out.println(Porsche.To_String());

        Skoda.setModel("Skoda Superb IV");
        Skoda.setLicense("В наличии");
        Skoda.setColor("Белый");
        Skoda.setYear(2023);
        System.out.println(Skoda.getModel());
        System.out.println(Skoda.getLicense());
        System.out.println(Skoda.getColor());
        System.out.println(Skoda.getYear() + "\n");

        System.out.println(Audi.autoAge());
    }
}