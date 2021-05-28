package pl.pjatk.lab9pd.Zad4;

import java.util.Comparator;

public class VMaxComparator implements Comparator<Zawodnik> {
    @Override
    public int compare(Zawodnik o1, Zawodnik o2) {
        return o1.getVmax()-o2.getVmax();
    }
}
