package pl.pjatk.lab6pd.Zad2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type number of positions: ");
        int maxSize = scan.nextInt();
        Position[] positions = new Position[maxSize];
        Order order = new Order(maxSize,positions);

        for (int i = 0; i < maxSize ; i++) {
            order.addPosition(i);
        }

        System.out.println("Order:\n"+ order +"\nSummary: "+order.countValue()+" zł");
    }
}
