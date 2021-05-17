package pl.pjatk.lab8.zadanie7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student ania = new Student("Anna", "Zaradna", "s22222");
        Student bogdan = new Student("Bogdan", "Niezaradny", "s11111");
        Student wiecznyStudent = new Student("Jan", "Wieczny", "s123");
        Student karolina = new Student("Karolina", "Nowak", "s12222");

        Student[] studenci = new Student[]{ania, bogdan, wiecznyStudent, karolina};

        System.out.println(Arrays.toString(studenci));

        Arrays.sort(studenci);

        System.out.println(Arrays.toString(studenci));
    }
}
