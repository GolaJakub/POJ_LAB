package pl.pjatk.lab2;
import java.util.Scanner;
public class Zad5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe wierszy i kolumn tablicy A: ");
        int wiersze1 = scan.nextInt();
        int kolumny1 = scan.nextInt();
        System.out.println("Podaj liczbe wierszy i kolumn tablicy B: ");
        int wiersze2 = scan.nextInt();
        int kolumny2 = scan.nextInt();
        int[][] tabA = new int[wiersze1][kolumny1];
        int[][] tabB = new int[wiersze2][kolumny2];
        System.out.println("Tablica A:");
        for (int i = 0; i < wiersze1; i++)
        {
            for(int j = 0; j < kolumny1; j++)
            {
                tabA[i][j] = (int) (Math.random() * 10);
                System.out.print(tabA[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("Tablica B:");
        for (int i = 0; i < wiersze2; i++)
        {
            for(int j = 0; j < kolumny2; j++)
            {
                tabB[i][j] = (int) (Math.random() * 10);
                System.out.print(tabB[i][j]+"\t");
            }
            System.out.print("\n");
        }

        System.out.println("Suma wszystkich elementow obu macierzy wynosi: "+suma(tabA,tabB));
    }
    private static int suma(int[][] tabA, int[][] tabB)
    {
        int wynik = 0;
        for(int i=0; i< tabA.length;i++)
        {
            for(int j=0; j<tabA[0].length;j++)
            {
                wynik+=tabA[i][j];
            }
        }
        for(int i=0; i< tabB.length;i++)
        {
            for(int j=0; j<tabB[0].length;j++)
            {
                wynik+=tabB[i][j];
            }
        }
        return  wynik;
    }
}
