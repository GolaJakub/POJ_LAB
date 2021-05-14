package pl.pjatk.lab6pd.Zad2;

public class Position {
    String productName;
    int numberOfPieces = 0;
    double piecePrice;

    protected double countValue(){
        return numberOfPieces*piecePrice;
    }

    @Override
    public String toString() {
        return  "\n"+productName+"\t"
                +piecePrice+" zł\t"
                +numberOfPieces+" szt.\t"+
                countValue()+" zł";
    }
}
