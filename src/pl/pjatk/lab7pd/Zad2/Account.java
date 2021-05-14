package pl.pjatk.lab7pd.Zad2;
public class Account {
    private String accountName;
    private double balance;
    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }
    public int withdraw(int amount) throws Exception{
        if (amount > balance){
            throw new InsufficientFundsException("Insufficient funds");
        }
        balance-=amount;
        return amount;
    }
    public double getBalance() {
        return balance;  }
}

