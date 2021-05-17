package pl.pjatk.lab8.zadanie5;

public class Kwadrat implements Figura, Comparable<Figura>{
    private final double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    @Override
    public double obliczPole() {
        return bok*bok;
    }

    @Override
    public double obliczObwod() {
        return 4*bok;
    }

    @Override
    public int compareTo(Figura o) {
        return (int)(this.obliczPole() - o.obliczPole());
    }

    @Override
    public String toString() {
        return String.format("Kwadrat o boku %.2f", bok);
    }
}
