package pl.pjatk.lab5pd.zad4;

public class Person {
    private static String name;
    private static String surname;
    private static int age;
    private static String sex;
    private static String pesel;

    protected Person(String name, String surname, int age, String sex, String pesel) {
        Person.name = name;
        Person.surname = surname;
        Person.age = age;
        Person.sex = sex;
        Person.pesel = pesel;
    }

    @Override
    public String toString() {
        return String.format(" name: %s\n surname: %s\n age: %s\n sex: %s\n pesel: %s",name,surname,age,sex,pesel);
    }
}
