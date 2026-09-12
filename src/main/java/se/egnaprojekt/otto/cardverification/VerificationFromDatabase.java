package se.egnaprojekt.otto.cardverification;

public class VerificationFromDatabase {


    private static boolean checkFromDatabase(String number, String cvv, String date) {
        for (Card card : Database.cards) {
            if (card.getNumber().equals(number) && card.getDate().equals(date) && card.getCvv().equals(cvv)) {
                return true;
            }
        }
        return false;
    }


    public static boolean startaDatabasKontroll(String number, String cvv, String date) {
        if (checkFromDatabase(number, cvv, date)) {
            IO.println("Card is valid");
            return true;
        }
        IO.println("Please enter a valid card");
        return false;
    }
}
