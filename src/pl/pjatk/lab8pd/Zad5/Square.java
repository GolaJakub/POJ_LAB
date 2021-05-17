package pl.pjatk.lab8pd.Zad5;

public class Square implements Figure,Comparable<Figure>{
    double side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double countPerimeter() {
        return 4*side;
    }

    @Override
    public double countArea() {
        return side*side;
    }
    @Override
    public int compareTo(Figure o) {
        return (int)(this.countArea() - o.countArea());
    }
    @Override
    public String toString() {
        return String.format("Square with side: %.2f",side);
    }
}
