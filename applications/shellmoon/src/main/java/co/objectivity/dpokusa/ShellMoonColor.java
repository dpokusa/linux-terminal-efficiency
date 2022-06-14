package co.objectivity.dpokusa;

import java.util.Random;

public enum ShellMoonColor {
    SILVER,
    GREEN,
    BLUE,
    YELLOW,
    RED;


    public static ShellMoonColor getRandomExceptRed() {
        Random random = new Random();
        return values()[random.nextInt(values().length - 1)];
    }
}
