package util.numbersUtil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void return_fizz_when_number_divisible_by_3() {

        assertEquals("Fizz",  FizzBuzz.evaluator(3));
        assertEquals("Fizz",  FizzBuzz.evaluator(6));
        assertEquals("Fizz",  FizzBuzz.evaluator(9));
        assertEquals("Fizz",  FizzBuzz.evaluator(12));
        assertEquals("Fizz",  FizzBuzz.evaluator(18));
        assertEquals("Fizz",  FizzBuzz.evaluator(21));
        assertEquals("Fizz",  FizzBuzz.evaluator(24));

    }

    @Test
    void return_buzz_when_number_divisible_by_5() {

        assertEquals("Buzz",  FizzBuzz.evaluator(5));
        assertEquals("Buzz",  FizzBuzz.evaluator(10));
        assertEquals("Buzz",  FizzBuzz.evaluator(20));
        assertEquals("Buzz",  FizzBuzz.evaluator(25));
        assertEquals("Buzz",  FizzBuzz.evaluator(35));
    }

    @Test
    void return_fizzbuzz_when_number_divisible_by_3_and_5() {
        assertEquals("FizzBuzz",  FizzBuzz.evaluator(15));
        assertEquals("FizzBuzz",  FizzBuzz.evaluator(30));
        assertEquals("FizzBuzz",  FizzBuzz.evaluator(15));
        assertEquals("FizzBuzz",  FizzBuzz.evaluator(15));
    }

    @Test
    void return_number_when_number_not_divisible_by_3_or_5() {
        assertEquals("4",  FizzBuzz.evaluator(4));
        assertEquals("2",  FizzBuzz.evaluator(2));
        assertEquals("7",  FizzBuzz.evaluator(7));
    }
}