package pl.pjatk.lab4pd.zad2;

import java.util.Scanner;

public class gra {
    int begin;
    int end;
    int random;


    public void range() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type range of numbers: ");
        this.begin = scan.nextInt();
        this.end = scan.nextInt();
    }


    public void getRandom() {
        this.random = (int) (Math.random() * (end - begin) + begin);
    }


    public void guess() {
        System.out.println("Type your number between " + begin + " and " + end);
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            int choice = scan.nextInt();
            if (choice != random && i == 5) {
                System.out.println("Your attempts limit is reached , the random number was: " + random);
                break;
            } else if (choice == random) {
                System.out.println("You guessed!!");
                break;
            } else if (choice > random) {
                System.out.println("Too big!, try again: ");
            } else {
                System.out.println("Too small!, try again: ");
            }
        }
    }
}
