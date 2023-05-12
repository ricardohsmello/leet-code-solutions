package br.com.ricas.exercises;

public class CenturyOfTheYear {

    public int century(int year) {
        if (year < 100) {
            return 1;
        }
        int century = year / 100;

        int carry = year % 10;

        if (carry > 0) {
            century+=1;
        }

        return century;
    }
}
