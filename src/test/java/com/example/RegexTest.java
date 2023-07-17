package com.example;

import org.junit.Assert;
import org.junit.Test;

public class RegexTest {

    @Test
    public void testOne() {
        Regex regex = new Regex();
        boolean result = regex.alphabet("cat");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testTwo() {
        Regex regex = new Regex();
        boolean result = regex.alphabet("what");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testThree() {
        Regex regex = new Regex();
        boolean result = regex.alphabet("hello");
        Assert.assertEquals(false, result);
    }

    @Test
    public void testFour() {
        Regex regex = new Regex();
        boolean result = regex.alphabet("THAT");
        Assert.assertEquals(false, result);
    }

    @Test
    public void testFive() {
        Regex regex = new Regex();
        boolean result = regex.numbers("19%");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testSix() {
        Regex regex = new Regex();
        boolean result = regex.numbers("300%");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testSeven() {
        Regex regex = new Regex();
        boolean result = regex.numbers("%");
        Assert.assertEquals(false, result);
    }

    @Test
    public void testEight() {
        Regex regex = new Regex();
        boolean result = regex.numbers("0%");
        Assert.assertEquals(false, result);
    }
}
