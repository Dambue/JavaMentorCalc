package ru.home;

public class Convert {
    static String stringResult = "";

    public Convert() {
    }

    public static String convertToArabic(int number){
        while (number >= 100) {
            stringResult += "C";
            number -= 100;
        }
        while (number >= 90) {
            stringResult += "XC";
            number -= 90;
        }
        while (number >= 50) {
            stringResult += "L";
            number -= 50;
        }
        while (number >= 40) {
            stringResult += "XL";
            number -= 40;
        }
        while (number >= 10) {
            stringResult += "X";
            number -= 10;
        }
        while (number >= 9) {
            stringResult += "IX";
            number -= 9;
        }
        while (number >= 5) {
            stringResult += "V";
            number -= 5;
        }
        while (number >= 4) {
            stringResult += "IV";
            number -= 4;
        }
        while (number >= 1) {
            stringResult += "I";
            number -= 1;
        }
        return stringResult;
    }
}
