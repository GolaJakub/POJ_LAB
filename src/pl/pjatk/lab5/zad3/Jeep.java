package pl.pjatk.lab5.zad3;

public class Jeep extends Car{
    public Jeep(String color, String brand) {
        super(color, brand);
    }

    private void use4x4(){
        System.out.println("Using 4x4.");
    }
}
