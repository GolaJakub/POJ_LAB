package pl.pjatk.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
    int size, first;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy: ");
        size = scan.nextInt();
        System.out.println("Podaj wartosc pierwszego elementu: ");
        first = scan.nextInt();

        int[] array = new int[size];
        array[0] = first;
        int second;
        if(first%2==0)
            second=first+2;
        else
            second=first+1;
        array[1]=second;
        for (int i=2;i<size;i++){
            second+=2;
            array[i]=second;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(String.format("Minimum to %d",min(array)));
        System.out.println(String.format("Maksimum to %d",max(array)));
        System.out.println(String.format("Suma wszystkich elementów to %d",sum(array)));
        System.out.println(String.format("Srednia wszystkich elementów to %.2f",avg(array)));
        System.out.println(String.format("Mediana wszystkich elementów to %.3f",median(array)));
    }

    private static double median(int[] array) {
        if(array.length%2==0){
           return (array[array.length/2]+array[array.length/2 -1])/2.0;
        }
        else
            return array[array.length/2];
    }

    private static double avg(int[] array) {
        return sum(array)/(double)array.length;
    }

    private static int sum(int[] array) {
        int sum=0;
        for(int i=0;i < array.length;i++){
            sum+=array[i];
        }
        return sum;
    }

    private static int max(int[] array) {
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    private static int min(int[] array) {
        int min = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
