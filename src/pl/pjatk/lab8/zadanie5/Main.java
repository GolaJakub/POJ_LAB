package pl.pjatk.lab8.zadanie5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figura[] figury = {new Kwadrat(2), new Kwadrat(4)};
        for (Figura figura:figury){
            System.out.println(figura.obliczObwod());
        }
        System.out.println(Arrays.toString(figury));
        Arrays.sort(figury);
        System.out.println(Arrays.toString(figury));
    }
}
