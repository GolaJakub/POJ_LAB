package pl.pjatk.lab9.Zad1;

public class MainStrings {
    public static void main(String[] args) {
        Lista<String> slowa = new Lista<>(10);
        System.out.println(slowa); // pusta
        slowa.dodaj("Kostka");
        System.out.println(slowa); // Kostka
        slowa.dodaj("plansza");
        System.out.println(slowa); // Kostka, plansza
        System.out.println(slowa.czyZawiera("Kostka"));//true
        System.out.println(slowa.czyZawiera("Pionek"));//false
        slowa.dodaj("Kostka");
        System.out.println(slowa.zwrocIndeks("Kostka"));
        System.out.println(slowa.zwrocOstatniIndeks("Kostka")); //2
        System.out.println(slowa.zwrocOstatniIndeks("plansza"));//1
        System.out.println(slowa.zwrocIndeks("plansza"));//1
        System.out.println(slowa.zwrocElement(10));//null
        System.out.println(slowa.zwrocElement(5));//null
        System.out.println(slowa.zwrocElement(1));//plansza
        System.out.println(slowa.podmienElement(0, "Pionek"));
        System.out.println(slowa.podmienElement(10, "Kawa"));
        System.out.println(slowa);

    }
}
