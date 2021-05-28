package pl.pjatk.lab9pd.Zad4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Zawodnik Jerzy = new Zawodnik("Jerzy","Urban",1,23);
        Zawodnik Aleks = new Zawodnik("Aleks","Polak",2,22);
        Zawodnik Norbert = new Zawodnik("Norbert","Gierczak",3,25);
        Zawodnik Eddie = new Zawodnik("Eddie","Murphy",4,10);
        Zawodnik[] zawodnicy = new Zawodnik[]{Aleks,Jerzy,Norbert,Eddie};
        System.out.println(Arrays.toString(zawodnicy));

        Arrays.sort(zawodnicy, new ImieComparator());
        System.out.println(Arrays.toString(zawodnicy));

        Arrays.sort(zawodnicy, new NumerComparator());
        System.out.println(Arrays.toString(zawodnicy));

        Arrays.sort(zawodnicy, new VMaxComparator());
        System.out.println(Arrays.toString(zawodnicy));
    }
}
