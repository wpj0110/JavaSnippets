package org.example;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CalculatorTest {


    List<Integer> case1 = Arrays.asList(4,1,3,9);
    List<Integer> case2 = Arrays.asList(4,-7,3,-10);
    List<Integer> case3 = Arrays.asList(0,4,-7,3,-10,5,5,141);
    List<Integer> case4 = Arrays.asList(4,-7,3,-10,5,5,141,0);

    @org.junit.Test
    public void addListTest() {

        assertEquals(17, Calculator.addList(case1));
        assertEquals(-10, Calculator.addList(case2));
        assertEquals(141, Calculator.addList(case3));
        assertEquals(141, Calculator.addList(case4));
    }

    @org.junit.Test
    public void subtractListTest() {

        assertEquals(-9, Calculator.subtractList(case1));
        assertEquals(18, Calculator.subtractList(case2));
        assertEquals(-141, Calculator.subtractList(case3));
        assertEquals(-133, Calculator.subtractList(case4));
    }

    @org.junit.Test
    public void multiplyListTest() {
        assertEquals(108, Calculator.multiplyList(case1));
        assertEquals(840, Calculator.multiplyList(case2));
        assertEquals(0, Calculator.multiplyList(case3));
        assertEquals(0, Calculator.multiplyList(case4));
    }

    @org.junit.Test
    public void divideListTest() {
        assertEquals(0, Calculator.divideList(case1));
        assertEquals(0, Calculator.divideList(case2));
        assertEquals(0, Calculator.divideList(case3));
    }


    //reference: https://github.com/wpj0110/JavaSnippets/blob/main/JUnitMaven/src/test/java/org/example/CalculationsTest.java#:~:text=%40Test(expected%20%3D%20ArithmeticException.class)%20//expects%20an%20ArithmeticException%20error.%20If%20not%2C%20something%20went%20wrong.
    @org.junit.Test(expected = ArithmeticException.class)
    public void divideListByZeroTest() {
        assertEquals(0, Calculator.divideList(case4));
    }
}