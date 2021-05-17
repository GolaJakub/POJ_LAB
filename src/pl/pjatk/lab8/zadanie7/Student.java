package pl.pjatk.lab8.zadanie7;

public class Student implements Comparable<Student>{
    private String imie;
    private String nazwisko;
    private String indeks;

    public Student(String imie, String nazwisko, String indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s)", imie, nazwisko, indeks);
    }

    @Override
    public int compareTo(Student that) {
        return Integer.parseInt(this.indeks.substring(1)) - Integer.parseInt(that.indeks.substring(1));
    }
}
