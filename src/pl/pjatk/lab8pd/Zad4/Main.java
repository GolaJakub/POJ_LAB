package pl.pjatk.lab8pd.Zad4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        Scanner scan = new Scanner(System.in);
        String pattern = scan.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        String dateInFormat = date.format(formatter);
        System.out.println(dateInFormat);
    }
}
