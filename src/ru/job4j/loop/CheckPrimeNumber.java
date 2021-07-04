package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean b = false;
        for (int i = number - 1; i >= 2; i--) {
            if (number % i == 0) {
                b = false;
                break;
            } else {
                b = true;
            }
        }
        return b;
    }
}