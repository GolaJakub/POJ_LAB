package pl.pjatk.lab3pd;

public class Account {
    int ID;
    double balance;

    public Account(int ID, double balance)
    {
        this.ID = ID;
        this.balance = balance;
    }

    public double balance()
    {
        return balance;
    }

    public void withdraw(double amount)
    {
        if(amount<balance)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("You can't withdraw more money than you have on your account");
        }
    }

    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance += amount;
        }
        else
        {
            System.out.println("You can't deposit negative amount");
        }
    }
}
