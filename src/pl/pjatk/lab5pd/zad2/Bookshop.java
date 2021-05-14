package pl.pjatk.lab5pd.zad2;

import java.util.Arrays;

public class Bookshop extends Shop{
    private static final String[] products = {"Garfield","365 days","The Witcher","Star-Wars"};

    protected Bookshop(String address, int size) {
        super(address, size);
    }

    @Override
    protected String getInformation() {
        return "Bookshop - "+super.getInformation()+", Shopping list: "+(Arrays.toString(products));
    }
}