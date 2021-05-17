package pl.pjatk.lab8pd.Zad5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Square square = new Square(2);
       Circle circle = new Circle(5);
       Rectangle rectangle = new Rectangle(2,4);

        Figure[] figures = new Figure[]{square,circle,rectangle};
        for (Figure figure:figures){
            System.out.println(figure.countPerimeter());
            System.out.println(figure.countArea());
        }
        Arrays.sort(figures);
        System.out.println(Arrays.toString(figures));
    }
}
