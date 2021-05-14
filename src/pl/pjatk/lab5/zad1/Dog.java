package pl.pjatk.lab5.zad1;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color);
    }

    public String makesound(){
        return String.format("woof,woof,\n I'm %s \n and I'm %s ",this.name,this.color);
    }
}
