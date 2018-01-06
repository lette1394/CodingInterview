package Chap16;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Problem5Test {

    Problem5 problem5;

    @Before
    public void before() {
        this.problem5 = new Problem5();
    }

    @Test
    public void 계승_계산() {
        assertEquals(1, problem5.getFactorial(0));
        assertEquals(1, problem5.getFactorial(1));
        assertEquals(2, problem5.getFactorial(2));
        assertEquals(6, problem5.getFactorial(3));
        assertEquals(24, problem5.getFactorial(4));
        assertEquals(120, problem5.getFactorial(5));
    }

    @Test
    public void numberOfTwo() {
        assertEquals(0, problem5.getNumberOfTwo(0));
        assertEquals(0, problem5.getNumberOfTwo(1));
        assertEquals(1, problem5.getNumberOfTwo(2));
        assertEquals(0, problem5.getNumberOfTwo(3));
        assertEquals(2, problem5.getNumberOfTwo(4));
        assertEquals(0, problem5.getNumberOfTwo(5));
        assertEquals(1, problem5.getNumberOfTwo(6));
        assertEquals(0, problem5.getNumberOfTwo(7));
        assertEquals(3, problem5.getNumberOfTwo(8));
        assertEquals(0, problem5.getNumberOfTwo(9));
        assertEquals(1, problem5.getNumberOfTwo(10));

        assertEquals(4, problem5.getNumberOfTwo(16));
        assertEquals(5, problem5.getNumberOfTwo(32));
        assertEquals(6, problem5.getNumberOfTwo(64));
        assertEquals(7, problem5.getNumberOfTwo(128));
    }

    @Test
    public void numberOfFive() {
        assertEquals(0, problem5.getNumberOfFive(0));
        assertEquals(0, problem5.getNumberOfFive(1));
        assertEquals(0, problem5.getNumberOfFive(2));
        assertEquals(0, problem5.getNumberOfFive(3));
        assertEquals(0, problem5.getNumberOfFive(4));
        assertEquals(1, problem5.getNumberOfFive(5));
        assertEquals(0, problem5.getNumberOfFive(6));
        assertEquals(0, problem5.getNumberOfFive(7));
        assertEquals(0, problem5.getNumberOfFive(8));
        assertEquals(0, problem5.getNumberOfFive(9));
        assertEquals(1, problem5.getNumberOfFive(10));

        assertEquals(2, problem5.getNumberOfFive(25));
        assertEquals(3, problem5.getNumberOfFive(125));
        assertEquals(4, problem5.getNumberOfFive(625));
        assertEquals(5, problem5.getNumberOfFive(3125));
    }

    @Test
    public void numberOfTen() {
        assertEquals(0, problem5.getNumberOfTen(0));
        assertEquals(0, problem5.getNumberOfTen(1));
        assertEquals(0, problem5.getNumberOfTen(2));
        assertEquals(0, problem5.getNumberOfTen(3));
        assertEquals(0, problem5.getNumberOfTen(4));
        assertEquals(0, problem5.getNumberOfTen(5));

        assertEquals(1, problem5.getNumberOfTen(10));
        assertEquals(1, problem5.getNumberOfTen(20));
        assertEquals(2, problem5.getNumberOfTen(100));
        assertEquals(3, problem5.getNumberOfTen(1000));
    }

    @Test
    public void numberOfTenInFactorial() {
        int factorial1 = problem5.getFactorial(0);
        assertEquals(0, problem5.getNumberOfTen(factorial1));

        int factorial2 = problem5.getFactorial(1);
        assertEquals(0, problem5.getNumberOfTen(factorial2));

        int factorial3 = problem5.getFactorial(2);
        assertEquals(0, problem5.getNumberOfTen(factorial3));

        int factorial4 = problem5.getFactorial(3);
        assertEquals(0, problem5.getNumberOfTen(factorial4));

        int factorial5 = problem5.getFactorial(4);
        assertEquals(0, problem5.getNumberOfTen(factorial5));

        int factorial6 = problem5.getFactorial(5);
        assertEquals(0, problem5.getNumberOfTen(factorial6));



    }
}


