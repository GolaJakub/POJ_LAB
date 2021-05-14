package pl.pjatk.lab2;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy: ");
        int size = scan.nextInt();
        String[] tab = new String[size];

        System.out.println("Podaj pierwszy znak tablicy: ");

        for(int i=0;i<size;i++){
            String znak = scan.next();
            System.out.println("Podaj kolejny znak: ");
            tab[i]=znak;
        }
        for(int i=0;i<size;i++){
            System.out.print(tab[i]+"\t");
        }
    }
}
