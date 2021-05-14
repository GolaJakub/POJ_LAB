package pl.pjatk.lab5.zad1;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat("Henryk", "grey");
        Dog dog = new Dog("Jasiek","white");
        System.out.println(cat.makesound());
        System.out.println(dog.makesound());
    }
}
