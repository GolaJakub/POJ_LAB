package pl.pjatk.lab3pd;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        ATM atm = new ATM();
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<10; i++)
        {
            accounts[i]=new Account(i,100);
        }

        for (;;)
        {
            System.out.println("Hello. Enter your ID: ");
            String input=scan.nextLine();
            if(input!="EXIT")
            {
                atm.user= accounts[Integer.parseInt(input)];
                atm.menu();
            }
            else
            {
                System.exit(0);
            }
        }
    }
}
