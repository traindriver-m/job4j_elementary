package ru.job4j.condition;

public class ChessBoard {

    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (Math.abs(Math.abs(x2) - Math.abs(x1)) == Math.abs(Math.abs(y2) - Math.abs(y1))) {
            rsl = Math.abs(x2 - x1);
        }
        return rsl;
    }
}
