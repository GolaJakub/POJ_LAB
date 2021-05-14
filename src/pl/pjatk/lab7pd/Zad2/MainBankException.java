package pl.pjatk.lab7pd.Zad2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainBankException {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)throws Exception {
        System.out.println("Do you want to create an account?");
        boolean doCreateAccount = getYesNoAnswer();
        if (!doCreateAccount) {
            endProgram();
        }
        Account account = null;
        try {
            account = createNewAccount();
        }catch (InsufficientFundsException exception){
            System.out.println("Name has to consist only of letters");
            endProgram();
        }


        System.out.println("Do you want to withdraw money?");
        boolean shouldWithdrawMoney = getYesNoAnswer();
        if (!shouldWithdrawMoney) {
            endProgram();
        }

        System.out.println("How much do you want to withdraw?");
        int amount = 0;
        try{
            amount = getAmount();
        }catch(InsufficientFundsException e){
            System.out.println("You can't withdraw negative amount");
            endProgram();
        }

        try{
            account.withdraw(amount);
        }catch(InsufficientFundsException e){
            System.out.println("You don't have that much money on your account");
            endProgram();
        }

        System.out.printf("Thank you for using our service. Your current balance is %.2f $", account.getBalance());
    }

    private static Account createNewAccount() throws Exception {
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        Pattern pattern = Pattern.compile("[A-Z a-z]");
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()){
            System.out.println("How much do you want to put down to your account?");
            int initialAmount=0;
            try{
                initialAmount = getAmount();
            }catch (InsufficientFundsException e){
                System.out.println("You can't deposit negative amount");
                endProgram();
            }
            return new Account(name, initialAmount);
        }else{
            throw new InsufficientFundsException("Name must has letters");
        }
    }

    private static int getAmount() throws Exception {
        int amount = Integer.parseInt(scanner.nextLine());
        if(amount>=0){
            return amount;
        }
        else{
            throw new InsufficientFundsException("You can't deposit/withdraw negative amount");
        }
    }

    private static void endProgram() {
        System.out.println("Thank you for using our service!");
        System.exit(0);
    }

    private static boolean getYesNoAnswer() {
        String userAnswer = scanner.nextLine();
        if (userAnswer.toLowerCase().contains("y")) {
            return true;
        } else if (userAnswer.toLowerCase().contains("n")) {
            return false;
        } else {
            System.out.println("Please enter 'yes' or 'no'.");
            return getYesNoAnswer();
        }
    }
}

