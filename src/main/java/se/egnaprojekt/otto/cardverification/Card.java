package se.egnaprojekt.otto.cardverification;


public class Card {
    private String number;
    private String date;
    private String cvv;

    public Card(String number, String date, String cvv) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
