package pl.pjatk.lab6pd.Zad2;

import java.util.Arrays;
import java.util.Scanner;

public class Order {
    Scanner scan = new Scanner(System.in);
    int maxSize;
    Position[] positions = new Position[maxSize];

    protected Order(int maxSize, Position[] positions) {
        this.maxSize = maxSize;
        this.positions = positions;
        for (int i = 0; i < maxSize; i++) {
            positions[i] = new Position();
        }
    }

    protected Order() {
        this.maxSize = 10;
    }

    protected void addPosition(int pos) {
        System.out.println("Type product name: ");
        positions[pos].productName = scan.next();
        System.out.println("Type price of one piece: ");
        positions[pos].piecePrice = scan.nextDouble();
        System.out.println("Type number of pieces: ");
        positions[pos].numberOfPieces = scan.nextInt();
    }
    protected double countValue(){
        double sum = 0;
        for (int i = 0; i < maxSize; i++) {
            sum += positions[i].countValue();
        }
        return sum;
    }


    @Override
    public String toString() {
        return Arrays.toString(positions);
    }
}
