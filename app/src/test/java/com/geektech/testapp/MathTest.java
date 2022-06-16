package com.geektech.testapp;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {

    Math math;

    @Before
    public void install(){
        math = new Math();
    }

    // Add Test
    @Test
    public void simpleAddTest(){
        assertEquals("12",math.add("6","6"));
    }

    @Test
    public void letterAddTest(){
        assertEquals("Буквы нельзя",math.add("6","a"));
    }

    @Test
    public void spaceAddTest(){
        assertEquals("Пробелы нельзя",math.add("6","  "));
    }
    @Test
    public void withDotAddTest(){
        assertEquals("Дробные числа нельзя",math.add("6.1","6"));
    }

    @Test
    public void negativeNumberAddTest(){
        assertEquals("Отрицательные числа нельзя",math.add("6","-6"));
    }
    @Test
    public void nullNumberAddTest(){
        assertEquals("Введите число",math.add("6",null));
    }
    //_____________________________________________________________________
      //Divide Test

    @Test
    public void simpleDivideTest(){
        assertEquals("10", math.divide("20","2"));
    }

    @Test
    public void letterDivideTest(){
        assertEquals("Буквы нельзя", math.divide("20", "a"));
    }

    @Test
    public void withDotDivideTest(){
        assertEquals("Дробные числа нельзя",math.divide("20","2.5"));
    }

    @Test
    public void divideByZero(){
        assertEquals("На 0 делить нельзя",math.divide("20","0"));
    }

    @After
    public void detach(){
        math = null;
    }
}
