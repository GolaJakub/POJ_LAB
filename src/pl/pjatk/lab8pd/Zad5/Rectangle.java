package pl.pjatk.lab8pd.Zad5;

public class Rectangle implements Figure,Comparable<Figure> {
    double side_a;
    double side_b;

    public Rectangle(int side_a, int side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    @Override
    public double countPerimeter() {
        return 2*side_a+2*side_b;
    }

    @Override
    public double countArea() {
        return side_a*side_b;
    }
    @Override
    public int compareTo(Figure o) {
        return (int)(this.countArea() - o.countArea());
    }
    @Override
    public String toString() {
        return String.format("Rectangle with sides: %.2f and %.2f",side_a,side_b);
    }
}
