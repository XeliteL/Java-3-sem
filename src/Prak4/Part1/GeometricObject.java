package Prak4.Part1;

public abstract class GeometricObject
        implements Comparable<GeometricObject> {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        this();
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
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    public static GeometricObject max(GeometricObject o1,  GeometricObject o2) {
        return (o1.compareTo(o2) >= 0) ? o1 : o2;
    }

    @Override
    public String toString() {
        return "Цвет: " + color +
               "\nЗакрашен: " + filled;
    }
}