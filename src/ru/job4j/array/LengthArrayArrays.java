package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{2}, {8, 11}, {7, 75, 9}, {0, 54, 16, 21}};
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[index].length);
        }
    }
}
