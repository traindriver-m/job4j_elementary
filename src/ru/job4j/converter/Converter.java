package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return -1;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
         in = 280;
        expected = 4;
        int outD = Converter.rubleToDollar(in);
        boolean passedD = expected == outD;
        System.out.println("280 rubles are 4. Test result : " + passedD);
    }
}

