package pl.pjatk.lab8pd.Zad5;

public class Circle implements Figure,Comparable<Figure> {
    double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double countPerimeter() {
        return 3.14 * Math.pow(radius,2);
    }

    @Override
    public double countArea() {
        return 3.14*radius;
    }
    @Override
    public int compareTo(Figure o) {
        return (int)(this.countArea() - o.countArea());
    }
    @Override
    public String toString() {
        return String.format("Circle with radius: %.2f",radius);
    }
}
