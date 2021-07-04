package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
        int n = 5;
        int expected = 120;
        int out = Factorial.calc(n);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        int n = 0;
        int expected = 1;
        int out = Factorial.calc(n);
        Assert.assertEquals(expected, out);
    }
}