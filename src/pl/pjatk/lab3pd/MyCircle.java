package pl.pjatk.lab3pd;

public class MyCircle {
    double radius;

    public MyCircle(double radius)
    {
        this.radius = radius;
    }

    public double Obwod()
    {
        return 2*Math.PI*radius;
    }

    public double Pole()
    {
        return Math.PI*(Math.pow(radius,2));
    }

    public double Srednica()
    {
        return radius*2;
    }
}
