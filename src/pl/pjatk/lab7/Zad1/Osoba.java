package pl.pjatk.lab7.Zad1;

public class Osoba {
    String imie;
    String nazwisko;
    int rok_ur;

    public Osoba(String imie, String nazwisko, int rok_ur) throws Exception {
        if (imie.isBlank() || nazwisko.isBlank()) {
            throw new Exception("Żadna z danych nie moze byc pusta!!");
        }
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rok_ur = rok_ur;

    }

    private void sprawdzDaneOsoby(String imie, String nazwisko, int rok_ur) throws Exception {
            if (imie.isBlank()) {
                throw new Exception("Nieprawdilowe imie!!");
            }
            if(nazwisko.isBlank()){
                throw new Exception("Nieprawidlowe nazwisko!!");
            }
            if(rok_ur < 1970 || rok_ur > 2021){
                throw new Exception("Nieprawidlowe nazwisko!!");
            }
        }

    }
