package pl.pjatk.lab5pd.zad2;

public class Shop {
    private final String address;
    private final int size;

    protected Shop(String address, int size) {
        this.address = address;
        this.size = size;
    }

    protected String getInformation(){
        return String.format("Adress: %s, size: %sm2",address,size);
    }
}