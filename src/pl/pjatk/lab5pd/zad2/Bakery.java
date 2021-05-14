package pl.pjatk.lab5pd.zad2;

import java.util.Arrays;

public class Bakery extends Shop{
    private static final String[] products = {"chleb","bulka","rogalik","bagietka"};

    protected Bakery(String address, int size) {
        super(address, size);
    }

    @Override
    protected String getInformation() {
        return "Bakery - "+super.getInformation()+", Shopping list: "+(Arrays.toString(products));
    }
}