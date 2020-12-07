package ru.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {


    public static void Start() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inpStr = reader.readLine().toUpperCase();
        String[] splitInpStr = inpStr.split(" ");
        String action = splitInpStr[1];
        int numberOne, numberTwo;
        boolean isArabicOrRoman = false;
        try {
            numberOne = Integer.parseInt(splitInpStr[0]);
            numberTwo = Integer.parseInt(splitInpStr[2]);
        } catch (NumberFormatException ex) {
            numberOne = RomanNumerals.convertRomNum(splitInpStr[0]);
            numberTwo = RomanNumerals.convertRomNum(splitInpStr[2]);
            isArabicOrRoman = true;
        }
        if (isArabicOrRoman)
            System.out.println(Convert.convertToArabic(Operation.Calc(numberOne, action, numberTwo)));
        else
            System.out.println(Operation.Calc(numberOne, action, numberTwo));
    }
}
