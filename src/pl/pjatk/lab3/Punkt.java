package pl.pjatk.lab3;

public class Punkt {
    int x;
    int y;

    public Punkt(){
        this.x = 0;
        this.y = 0;
    }

    public Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double odleglosc(int x, int y){
        return Math.sqrt(Math.pow((x - this.x), 2)+Math.pow((y-this.y), 2));
    }

    public double odleglosc(Punkt punkt){
        return Math.sqrt(Math.pow((punkt.x - this.x), 2)+Math.pow((punkt.y-this.y), 2));
    }
}
