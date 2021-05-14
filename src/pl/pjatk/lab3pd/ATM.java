package pl.pjatk.lab3pd;

import java.util.Scanner;

public class ATM {
    Account user;
    Scanner scan = new Scanner(System.in);

    public void menu()
    {
        int choice = 0;
        while(choice!=4)
        {
            System.out.println("1: check balance\n" + "2: withdraw\n" + "3: deposit\n" + "4: exit");
            choice=scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Balance : "+user.balance());
                    break;
                case 2:
                    System.out.println("Enter amount you want to withdraw: ");
                    user.withdraw(scan.nextInt());
                    break;
                case 3:
                    System.out.println("Enter amount you want to deposit: ");
                    user.deposit(scan.nextInt());
                    break;
                case 4:
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }
        }
    }
}
