package com.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class AppTest {
    //True assertion
    @Test
    public void isTrue() {
        assertTrue(true);
    }
    //False assertion
    @Test
    public void isFalse(){assertFalse(false);}
    //Equals assertion
    @Test
    public void AdditionTest() {

        final int expected = 20;
        final int actual = App.add(10, 10);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void SubtractionTest() {

        final int expected = 100;
        final int actual = App.subtract(110,10);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void MultiplicationTest() {

        final int expected = 80;


        final int actual = App.multiply(8, 10);


        Assert.assertEquals(expected, actual);
    }
    @Test
    public void DivisionTest() {

        final int expected = 65;


        final int actual = App.divide(650, 10);


        Assert.assertEquals(expected, actual);
    }

}