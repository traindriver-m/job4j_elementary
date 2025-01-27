package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {176, 14, 56};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {14, 56, 176};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {91, 12, 45, 0, 102};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 12, 45, 91, 102};
        Assert.assertArrayEquals(expected, result);
    }
}