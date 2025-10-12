package Prak4.Part1;

public abstract class GeometricObject
        implements Comparable<GeometricObject> {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject() {
        dateCreated = new java.util.Date();  // фиксируем момент создания
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();  // фиксируем дату создания
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) { this.color = color; }
    public String getColor() { return this.color; }

    public void setFilled(boolean   filled) { this.filled = filled; }
    public boolean getFilled() { return this.filled; }

    public java.util.Date getDateCreated() { return dateCreated; }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject other) {
        if (this.getArea() > other.getArea()) return 1;
        else if (this.getArea() < other.getArea()) return -1;
        return 0;
    }

    public static GeometricObject max(GeometricObject o1,  GeometricObject o2) {
        return (o1.compareTo(o2) >= 0) ? o1 : o2;
    }

    @Override
    public String toString() {
        return "Создан: " + dateCreated +
                "\nЦвет: " + color +
                "\nЗакрашен: " + filled;
    }
}