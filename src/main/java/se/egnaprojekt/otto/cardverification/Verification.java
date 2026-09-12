package se.egnaprojekt.otto.cardverification;

import java.util.Random;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Verification {
    private final DateTimeFormatter EXPIRATIONDATE = DateTimeFormatter.ofPattern("MM/yy");

    private String enterNumber() {
        while (true) {
            try{
                String number = IO.readln("Write your card number:   ");
                if (luhnvalid(number)) {
                    return number;
                }
                else if (!luhnvalid(number)) {
                    throw new IllegalArgumentException("Invalid card number");
                }
            }catch (IllegalArgumentException e){
                IO.println(e.getMessage());
            }
            //return null;
        }

    }

    private String enterCvv() {
        while (true) {
            try {
                String cvv = IO.readln("Write your cvv:       ");
                if(validCvvLocal(cvv)) {
                    return cvv;
                }
                else if (!validCvvLocal(cvv)) {
                    throw new IllegalArgumentException("Invalid cvv");
                }
            }catch (IllegalArgumentException e){
                IO.println(e.getMessage());
            }
        }

        //return null;
    }

    private String enterDate() {
        while (true) {
            try {
                String date = IO.readln("Write your date (MM/yy):     ");
                if(validDate(date)) {
                    return date;
                }
                else if (!validDate(date)) {
                    throw new IllegalArgumentException("Invalid date or wrong formated date\nYou need to write MM/yy\nOr you need to update your card");
                }
            }catch (IllegalArgumentException e){
                IO.println(e.getMessage());
            }
        }

        //return null;
    }

    private boolean luhnvalid(String number) {
        int summa = 0;
        boolean dubbla = false;
        for (int i = number.length() - 1; i >= 0; i--) {
            int siffra = number.charAt(i) - '0';
            if (dubbla) {
                siffra *= 2;
                if (siffra > 9) {
                    siffra -= 9;
                }
            }
            summa += siffra;
            dubbla = !dubbla;
        }
        return summa % 10 == 0;
    }


    private boolean validCvvLocal(String cvv) {
        return cvv.length()==3;
    }


    private boolean validDate(String date) {
        try{
            YearMonth cardmonth = YearMonth.parse(date, EXPIRATIONDATE);
            return !cardmonth.isBefore(YearMonth.now());
        }catch (DateTimeParseException e){
            return false;
        }

    }


    public void checkCard(){
        enterNumber();
        enterCvv();
        enterDate();
    }
}