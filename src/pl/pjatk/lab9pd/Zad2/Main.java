package pl.pjatk.lab9pd.Zad2;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Slownik<String, String> slownik = new Slownik<>(4);
        slownik.dodaj("sowa","owl");
        slownik.dodaj("auto","car");
        slownik.dodaj("komputer","computer");
        slownik.dodaj("malpa","monkey");

        System.out.println(slownik.czyZawiera("statek"));
        System.out.println(slownik.czyZawiera("auto"));

        System.out.println(slownik.wielkosc());
        System.out.println(slownik);

        File slownikPlik = new File("./src/pl/pjatk/lab9pd/Zad2/slownik.txt");
        Slownik slownikZPliku = Slownik.wczytajSlownik(slownikPlik);
        System.out.println(slownikZPliku);
    }
}
