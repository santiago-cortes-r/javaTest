package util.numbersUtil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToRomanNumberTest {
    @Test
    void return_roman_number() {
        assertEquals("X", NumberToRomanNumber.toRoman(10));
        assertEquals("XC", NumberToRomanNumber.toRoman(90));
        assertEquals("C", NumberToRomanNumber.toRoman(100));
        assertEquals("CXL", NumberToRomanNumber.toRoman(140));
        assertEquals("MCMXC", NumberToRomanNumber.toRoman(1990));
        assertEquals("MDXXXIV", NumberToRomanNumber.toRoman(1534));
        assertEquals("MCMXLVII", NumberToRomanNumber.toRoman(1947));
    }
}