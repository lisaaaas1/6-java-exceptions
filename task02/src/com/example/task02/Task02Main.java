package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber) {
        switch (monthNumber) {
            case 1: return "зима";
            case 2: return "зима";
            case 3: return "весна";
            case 4: return "весна";
            case 5: return "весна";
            case 6: return "лето";
            case 7: return "лето";
            case 8: return "лето";
            case 9: return "осень";
            case 10: return "осень";
            case 11: return "осень";
            case 12: return "зима";
            default:
                throw new IllegalArgumentException("monthNumber "+monthNumber+" is invalid, month number should be between 1..12");
        }
    }
}