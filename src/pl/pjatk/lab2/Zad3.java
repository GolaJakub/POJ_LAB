package pl.pjatk.lab2;
import java.util.Scanner;
import java.util.Arrays;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy A: ");
        int size1 = scan.nextInt();
        System.out.println("Podaj wielkosc tablicy B: ");
        int size2 = scan.nextInt();
        int[] tabA = new int[size1];
        int[] tabB = new int[size2];
        for (int i = 0; i < size1; i++) {
            tabA[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < size2; i++) {
            tabB[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < size1; i++) {
            System.out.print(tabA[i] + "\t");
        }
        System.out.println("\n");
        for (int i = 0; i < size2; i++) {
            System.out.print(tabB[i] + "\t");
        }
        System.out.println("\n");
        System.out.print(Arrays.toString(suma(tabA, tabB)));
    }


    private static int[]  suma(int[] tabA, int[] tabB) {
        int[] tabC = new int[tabA.length];
        if (tabA.length == tabB.length) {
            for (int i = 0; i < tabA.length; i++) {
                tabC[i] = tabA[i] + tabB[i];
            }
        }
        else {
            tabC = new int[0];
            }
        return tabC;
        }
    }










