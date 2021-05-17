package pl.pjatk.lab8.zadanie3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        int foundYears=0;

        while (foundYears<100){
            if (date.isLeapYear()){
                System.out.println(date.getYear());
                foundYears++;
            }
            date = date.plusYears(1);
        }
    }
}
