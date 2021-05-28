package pl.pjatk.lab9pd.Zad4;

public class Zawodnik {
    private String imie,nazwisko;
    private int numer;
    private int vmax;

    public Zawodnik(String imie, String nazwisko, int numer, int vmax) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer = numer;
        this.vmax = vmax;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNumer() {
        return numer;
    }

    public int getVmax() {
        return vmax;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%d) - vmax: %d km/h", imie, nazwisko, numer, vmax);
    }
}
