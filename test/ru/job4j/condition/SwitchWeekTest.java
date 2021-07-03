package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void nameOfDay() {
        int i = 5;
        String out = SwitchWeek.nameOfDay(i);
        String expected = "Пятница";
        Assert.assertEquals(expected, out);
    }
}