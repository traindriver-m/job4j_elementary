package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(280);
        System.out.println("280 rubles are " + dollar + " dollars.");
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int inD = 280;
        int expectedD = 4;
        int outD = Converter.rubleToDollar(inD);
        boolean passedD = expectedD == outD;
        System.out.println("280 rubles are 4. Test result : " + passedD);
    }
}

