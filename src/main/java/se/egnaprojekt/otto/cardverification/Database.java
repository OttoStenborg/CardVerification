package se.egnaprojekt.otto.cardverification;

import java.util.ArrayList;

public class Database {
    static ArrayList<Card> cards = new ArrayList<>();


    public Database() {
        cards.add(new Card("4104332181960018", "12/26", "482"));
        cards.add(new Card("4338908386379407", "03/27", "915"));
        cards.add(new Card("4265423511615599", "06/28", "204"));
        cards.add(new Card("5407816184959317", "09/27", "731"));
        cards.add(new Card("5034131647525536", "11/26", "058"));
        cards.add(new Card("5419283276483506", "04/29", "369"));
        cards.add(new Card("4305641395376721", "07/27", "142"));
        cards.add(new Card("4423884969653284", "10/28", "690"));
        cards.add(new Card("5710122691669784", "02/27", "823"));
        cards.add(new Card("4480184514627044", "05/28", "377"));
    }


    public ArrayList<Card> getCards() {
        return cards;
    }


    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }


}
