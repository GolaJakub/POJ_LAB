package pl.pjatk.lab3;

public class zad2 {
    public static void main(String[] args) {
        Punkt punkt = new Punkt(2,5);

        System.out.println(punkt.odleglosc(5,9));
        System.out.println(punkt.odleglosc(new Punkt(5,9)));
    }
}
