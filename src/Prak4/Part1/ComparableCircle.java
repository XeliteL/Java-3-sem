package Prak4.Part1;

import Prak4.Part1.figures.Circle;

public class ComparableCircle extends Circle {
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (o instanceof Circle)
            return Double.compare(this.getArea(), ((Circle) o).getArea());
        return 0;
    }
}
