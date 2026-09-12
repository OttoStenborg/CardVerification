package se.egnaprojekt.otto.cardverification;

import java.util.ArrayList;

public class Database {
    ArrayList<Card> cards = new ArrayList<>();
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }


}
