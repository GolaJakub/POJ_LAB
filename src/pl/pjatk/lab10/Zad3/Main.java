package pl.pjatk.lab10.Zad3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double first = scan.nextDouble();
        Double second = scan.nextDouble();
        Double third = scan.nextDouble();

        HashSet<Double> elements = new HashSet<>();

        elements.add(first);
        elements.add(second);
        elements.add(third);
        Double suma = 0.0;
        Iterator<Double> iterator = elements.iterator();


        while(iterator.hasNext()){
            Double next = iterator.next();
            suma+=next;
        }
    }
}
