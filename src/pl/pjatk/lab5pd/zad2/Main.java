package pl.pjatk.lab5pd.zad2;

public class Main {
    public static void main(String[] args) {
        Bookshop bookshop = new Bookshop("Piekarnicza 20",120);
        Bakery bakery = new Bakery("Korczaka 21",150);

        System.out.println(bookshop.getInformation());
        System.out.println(bakery.getInformation());
    }
}