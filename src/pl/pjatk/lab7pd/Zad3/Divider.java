package pl.pjatk.lab7pd.Zad3;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Divider {
    public static void main(String[] args) throws Exception {
        Pattern pattern = Pattern.compile("[0-9]");
        String number = JOptionPane.showInputDialog(null, "Podaj liczbę");
        Matcher matcher = pattern.matcher((number));
        if(!matcher.find()){
            throw new Exception("Podana wartosc nie jest liczba");
        }

        String divider = JOptionPane.showInputDialog(null, "Podaj dzielnik");

        Matcher Divider = pattern.matcher((divider));
        if(!Divider.find()){
            throw new Exception("Podana wartosc nie jest liczba");
        }

        try {
            int result = convertToInteger(number)/convertToInteger(divider);
            JOptionPane.showMessageDialog(null, String.format("Wynik dzielenia to %d", result));
        } catch(ArithmeticException exc){
            System.out.println("Blad, nie mozna dzielic przez zero");
        }

    }

    private static int convertToInteger(String number){
        return Integer.parseInt(number);
    }
}
