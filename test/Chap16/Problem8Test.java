package Chap16;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class Problem8Test {
    Problem8 p8;

    @Before
    public void before() {
        this.p8 =  new Problem8();
    }

    @Test
    public void oneChar() {
        assertEquals("Zero", p8.parse(0));
        assertEquals("One", p8.parse(1));
        assertEquals("Two", p8.parse(2));
        assertEquals("Three", p8.parse(3));
        assertEquals("Four", p8.parse(4));
        assertEquals("Five", p8.parse(5));
        assertEquals("Six", p8.parse(6));
        assertEquals("Seven", p8.parse(7));
        assertEquals("Eight", p8.parse(8));
        assertEquals("Nine", p8.parse(9));
    }

    @Test
    public void TenToNineTeen() {
        assertEquals("Ten", p8.parse(10));
        assertEquals("Eleven", p8.parse(11));
        assertEquals("Twelve", p8.parse(12));
        assertEquals("Thirteen", p8.parse(13));
        assertEquals("Fourteen", p8.parse(14));
        assertEquals("Fifteen", p8.parse(15));
        assertEquals("Sixteen", p8.parse(16));
        assertEquals("Seventeen", p8.parse(17));
        assertEquals("Eighteen", p8.parse(18));
        assertEquals("Nineteen", p8.parse(19));
    }

    @Test
    public void TwentyToThirty() {
        assertEquals("Twenty", p8.parse(20));
        assertEquals("Twenty One", p8.parse(21));
        assertEquals("Twenty Two", p8.parse(22));
        assertEquals("Twenty Three", p8.parse(23));
        assertEquals("Twenty Four", p8.parse(24));
        assertEquals("Twenty Five", p8.parse(25));
        assertEquals("Twenty Six", p8.parse(26));
        assertEquals("Twenty Seven", p8.parse(27));
        assertEquals("Twenty Eight", p8.parse(28));
        assertEquals("Twenty Nine", p8.parse(29));
    }

    @Test
    public void ThirtyToNinety() {
        assertEquals("Thirty", p8.parse(30));
        assertEquals("Forty", p8.parse(40));
        assertEquals("Fifty", p8.parse(50));
        assertEquals("Sixty", p8.parse(60));
        assertEquals("Seventy", p8.parse(70));
        assertEquals("Eighty", p8.parse(80));
        assertEquals("Ninety", p8.parse(90));
    }

    @Test
    public void multipleOfTen() {
        assertEquals("One Hundred", p8.parse(100));
        assertEquals("One Thousand", p8.parse(1000));
        assertEquals("Ten Thousand", p8.parse(10000));
    }

    @Test
    public void example() {
        assertEquals("Two Hundred Thirty Four", p8.parse(234));
        assertEquals("One Thousand Two Hundred Thirty Four", p8.parse(1234));
    }

    @Test
    public void twoWords() {
        assertEquals("Fifty Nine", p8.parse(59));
        assertEquals("Thirty Three", p8.parse(33));
        assertEquals("Ninety Nine", p8.parse(99));
        assertEquals("Seventy One", p8.parse(71));
    }

    @Test
    public void ThreeWords() {
        assertEquals("Two Hundred Fifty Nine", p8.parse(259));
        assertEquals("Eight Hundred Thirty Three", p8.parse(833));
        assertEquals("Nine Hundred Ninety Nine", p8.parse(999));
        assertEquals("Two Hundred Seventy One", p8.parse(271));
    }

    @Test
    public void placeValue() {
        assertEquals(1, p8.countPlaceValue(0));
        assertEquals(1, p8.countPlaceValue(1));

        assertEquals(2, p8.countPlaceValue(10));
        assertEquals(2, p8.countPlaceValue(94));

        assertEquals(3, p8.countPlaceValue(100));
        assertEquals(4, p8.countPlaceValue(1010));
    }

    @Test
    public void getEachValues() {
        assertArrayEquals(new int[] {0}, p8.getEachValues(0));
        assertArrayEquals(new int[] {0, 1}, p8.getEachValues(10));
        assertArrayEquals(new int[] {0, 2, 1}, p8.getEachValues(120));
        assertArrayEquals(new int[] {6, 4, 1, 8}, p8.getEachValues(8146));
    }

}
