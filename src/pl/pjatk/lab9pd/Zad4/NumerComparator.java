package pl.pjatk.lab9pd.Zad4;

import java.util.Comparator;

public class NumerComparator implements Comparator<Zawodnik> {
    @Override
    public int compare(Zawodnik o1, Zawodnik o2) {
        return o1.getNumer()-o2.getNumer();
    }
}
