package ru.home;

public class RomanNumerals {
    static int numb;

    public RomanNumerals() {
    }

    public static int convertRomNum(String inNum) {
        switch (inNum) {
            case "I":
                numb = 1;
                break;
            case "II":
                numb = 2;
                break;
            case "III":
                numb = 3;
                break;
            case "IV":
                numb = 4;
                break;
            case "V":
                numb = 5;
                break;
            case "VI":
                numb = 6;
                break;
            case "VII":
                numb = 7;
                break;
            case "VIII":
                numb = 8;
                break;
            case "IX":
                numb = 9;
                break;
            case "X":
                numb = 10;
                break;
            default:
                throw new IllegalArgumentException();
        }
        return numb;
    }
}