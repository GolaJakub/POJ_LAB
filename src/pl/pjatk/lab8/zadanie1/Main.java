package pl.pjatk.lab8.zadanie1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("Input");
        int sum = 0;
        try (Scanner scanner = new Scanner(file)){
            for (int i=0; scanner.hasNext() ;i++){
                if (i%2==0){
                    sum += scanner.nextInt();
                }else {
                    scanner.nextInt();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }
}
