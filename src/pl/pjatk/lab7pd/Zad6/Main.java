package pl.pjatk.lab7pd.Zad6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);  System.out.println("Podaj imiona :");
        String string=scanner.nextLine();
        Pattern pattern = Pattern.compile("\b[aeiouAEIOU]+\\S*");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
