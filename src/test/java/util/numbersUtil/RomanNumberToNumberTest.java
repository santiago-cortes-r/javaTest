package util.numbersUtil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberToNumberTest {

    @Test
    void return_number_base10() {
        assertEquals(10, RomanNumberToNumber.toNumber("X"));
        assertEquals(4, RomanNumberToNumber.toNumber("IV"));
        assertEquals(9, RomanNumberToNumber.toNumber("IX"));
        assertEquals(100, RomanNumberToNumber.toNumber("C"));
        assertEquals(50, RomanNumberToNumber.toNumber("L"));
        assertEquals(1987, RomanNumberToNumber.toNumber("MCMLXXXVII"));
    }
}