package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculationsTest{

    @Before //very useful for opening a database connection if needed.
    public void beforeHello(){
        System.out.println("Beginning the test");
    }

    @After //very useful for closing a database connection if a connection was opened.
    public void afterHello(){
        System.out.println("After the test");
    }

    //@Ignore //optional
    @Test
    public void additionTest(){
        assertEquals(5,Calculations.Addition(4,5)); //this will cause an error. I could add @Ignore above @Test to ignore this test case.
    }

    @Test(expected = ArithmeticException.class) //expects an ArithmeticException error. If not, something went wrong.
    public void divideZeroTest(){
        assertEquals(4,Calculations.Division(20,0));
    }
    @Test
    public void divideTest(){
        assertEquals(4,Calculations.Division(20,5));
        assertEquals(2,Calculations.Division(20,10));
    }
}