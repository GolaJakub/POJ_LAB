package pl.pjatk.lab7.Zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String imie;
        String nazwisko;
        int rok_ur;
        boolean danePoprawne = false;


        while(!danePoprawne){
            System.out.println("Podaj imie: ");
            imie = scan.nextLine();

            System.out.println("Podaj nazwisko: ");
            nazwisko = scan.nextLine();

            System.out.println("Podaj rok urodzenia: ");
            rok_ur = scan.nextInt();
            scan.nextLine();

            try {
                Osoba osoba = new Osoba(imie,nazwisko,rok_ur);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }


    }
}
