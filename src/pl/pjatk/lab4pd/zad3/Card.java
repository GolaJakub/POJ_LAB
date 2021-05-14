package pl.pjatk.lab4pd.zad3;

public class Card {
    final private Ranks ranks;
    final private Suits suits;

    public Card(Ranks ranks, Suits suits){
        this.ranks = ranks;
        this.suits = suits;
    }

    @Override
    public String toString() {
        return "Card  " +
                ranks +" "+
                suits.getSign();
    }
}
