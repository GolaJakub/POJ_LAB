package pl.pjatk.lab2;
import java.util.Scanner;
public class Zad7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy: ");
        int size = scan.nextInt();
        int[] tabA = new int[size];
        for(int i = 0;i<size;i++)
        {
            tabA[i] = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
            System.out.print(tabA[i]+"\t");
        }
        System.out.println("Suma tylko liczb dodatnich wynosi: "+ suma(tabA));
    }

    private static int suma(int[] tabA)
    {
        int wynik = 0;
        for(int i = 0; i < tabA.length; i++)
        {
            if(tabA[i] > 0)
            {
                   wynik+=tabA[i];
            }
        }
        return wynik;
    }
}