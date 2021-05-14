package pl.pjatk.lab6pd.Zad6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("How many words you want to type?");
        int numberOfWords = scan.nextInt();
        System.out.println("What which has to be deleted?");
        int whatWhich = scan.nextInt();

        for (int i = 1; i <= numberOfWords; i++) {
            System.out.println("Add " + i + " word");
            words.add(scan.next());
        }

        System.out.println("Before: ");
        for (String word : words) {
            System.out.print(word + " ");
        }

        System.out.println(whatWhichMethod(words, whatWhich));
    }

    private static String whatWhichMethod(ArrayList<String> words, int whatWhich) {
        String result = "";
        for (int i = 1; i < words.size() + 1; i++) {
            if (i % whatWhich != 0) {
                result += words.get(i - 1) + " ";
            }
        }
        result = "\nAfter:\n"+result;
        return result;
    }
}



