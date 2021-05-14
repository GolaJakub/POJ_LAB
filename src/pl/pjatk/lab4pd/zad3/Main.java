package pl.pjatk.lab4pd.zad3;

public class Main {
    public static void main(String[] args) {
        Card[][] cards = new Card[4][13];
        for (int i = 0; i < 13; i++){
            for (int j = 0; j < 4; j++){
                cards[j][i] = new Card(Ranks.values()[i], Suits.values()[j]);
            }
        }

        for (int i = 0; i < 4 ; i++){
            for (int j = 0; j < 13; j++){
                System.out.println(cards[i][j].toString());
            }
        }
    }
}