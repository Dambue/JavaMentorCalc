package ru.home;

public class Operation {
    static int result;

    public Operation() {
    }

    public static int Calc(int left, String between, int right) {
        if ((left >= 1 && left <= 10) && (right >= 1 && right <= 10)) {
            switch (between) {
                case "+":
                    result = left + right;
                    break;
                case "-":
                    result = left - right;
                    break;
                case "*":
                    result = left * right;
                    break;
                case "/":
                    result = left / right;
                    break;
                default:
                    throw new ArithmeticException();
            }
        }
        else
            throw new IllegalArgumentException();
        return result;
    }
}
