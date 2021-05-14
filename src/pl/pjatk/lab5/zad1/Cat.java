package pl.pjatk.lab5.zad1;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color);
    }

    public String makesound(){
        return String.format("meow,meow,\n I'm %s \n and I'm %s ",this.name,this.color);
    }
}
