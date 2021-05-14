package pl.pjatk.lab5.zad3;

public class Pickup extends Car {
    private final  int wheelSize;

    public Pickup(String color,String brand,int wheelSize) {
        super(color,brand);
        this.wheelSize = wheelSize;
    }
    public int getWheelSize(){
        return wheelSize;
    }
}
