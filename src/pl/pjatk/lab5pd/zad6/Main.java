package pl.pjatk.lab5pd.zad6;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.calculate(2));
        System.out.println(calc.calculate(2,4));
        System.out.println(calc.calculate(1,2,3));
    }
}