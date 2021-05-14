package pl.pjatk.lab4pd.zad3;

public enum Suits {
    HEARTS('\u2764'),
    DIAMONDS('\u2666'),
    CLUBS('\u2663'),
    SPADES('\u2660');

    private final char sign;
    Suits(char sign) {
        this.sign = sign;
    }
    public char getSign(){
        return sign;
    }
}
