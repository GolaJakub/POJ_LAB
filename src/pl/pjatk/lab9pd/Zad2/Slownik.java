package pl.pjatk.lab9pd.Zad2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Slownik <K,V> {
    private K[] klucze;
    private V[] wartosci;

    public Slownik(int size) {
        klucze = (K[])new Object[size];
        wartosci = (V[]) new Object[size];
    }

    public boolean dodaj(K klucz, V wartosc){
        int indeks = pierwszyWolnyIndeks();
        if (czyZawiera(klucz)){
            indeks = indeksKlucza(klucz);
            return true;
        }else if(indeks<klucze.length){//jest miejsce w tablicy kluczy to dodaj nowy klucz i wartosc
            klucze[indeks] = klucz;
            wartosci[indeks] = wartosc;
            return true;
        }else {//nie ma miejsca na dodanie nowej pary
            return false;
        }
    }

    private int indeksKlucza(K klucz) {
        for (int i=0; i<pierwszyWolnyIndeks(); i++){
            if (klucze[i].equals(klucz)){
                return i;
            }
        }
        return -1;
    }

    public boolean czyZawiera(K klucz){
        //TODO: zaimplementować!
        for (int i = 0; i < klucze.length; i++) {
            if(klucze[i]!=null && klucze[i].equals(klucz)){
                return true;
            }
        }
        return false;
    }

    private int pierwszyWolnyIndeks(){
        if (klucze[0]==null){
            return 0;
        }
        int wolnyIndeks=1;
        for (int i=1;i<klucze.length; i++){
            if (klucze[i]==null){
                return i;
            }
            wolnyIndeks++;
        }
        return wolnyIndeks>klucze.length? -1:wolnyIndeks;
    }
    public int wielkosc(){
        int wielkosc = 0;
        for (int i = 0; i < wartosci.length; i++) {
            wielkosc++;
        }
        return wielkosc;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("[");
        for (int i=0;i<pierwszyWolnyIndeks();i++){
            buffer.append(String.format("%s->%s,", klucze[i], wartosci[i]));
        }
        if (buffer.length()>1){
            buffer.deleteCharAt(buffer.length()-1);
        }
        buffer.append("]");
        return buffer.toString();
    }

    public static Slownik<String, String> wczytajSlownik(File file) throws FileNotFoundException {
        //TODO: zaimplementować! (Zadanie 3)
        //Znalezc rozmiar pliku - ile jest linii w pliku
        //Utworzyc slownik o rozmiarze linii w pliku
        //Wczytywac plik linijka po linijce, splitowac i dodawac nowe hasla [0] i [1] element splita
        //Zwrocic utworzony obiekt typu Slownik
        Scanner scanner = new Scanner(file);
        Scanner scanner1 = new Scanner(file);
        int size = 0;
        while(scanner.hasNext()){
            size += 1;
            scanner.next();
        }
        Slownik slownik = new Slownik(size);
        while(scanner1.hasNext()){
            String line = scanner1.nextLine();
            String[] line1 = line.split("-");
            slownik.dodaj(line1[0],line1[1]);
        }
        return slownik;

    }
}
