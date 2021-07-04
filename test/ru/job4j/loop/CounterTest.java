package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromSevenToFifteenFortyFour() {
        int start = 7;
        int finish = 15;
        int result = Counter.sumByEven(start, finish);
        int expected = 44;
        Assert.assertEquals(expected, result);
    }
}