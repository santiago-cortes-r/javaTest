package discounts;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import static org.junit.jupiter.api.Assertions.*;

class PreciCalculatorShould {

    @Test
    void return_zero_when_precies_is_empty() {

       PreciCalculator calculator = new PreciCalculator();
        assertThat(calculator.getTotal(), is(0.0));
    }

    @Test
    void return_total_that_is_same_sum_precies() {

        PreciCalculator calculator = new PreciCalculator();
        calculator.addPrecie(25.2);
        calculator.addPrecie(25.3);

        assertThat(calculator.getTotal(), is(50.5));
    }

    @Test
    void return_total_with_discount() {

        PreciCalculator calculator = new PreciCalculator();
        calculator.addPrecie(600);
        calculator.addPrecie(200);

        calculator.setDiscount(25);

        assertThat(calculator.getTotal(), is(600.0));
    }

    @Test
    void return_total_without_last_price() {

        PreciCalculator calculator = new PreciCalculator();
        calculator.addPrecie(600);
        calculator.addPrecie(200);
        calculator.addPrecie(200);

        calculator.setDiscount(25);

        calculator.deleteLastPrice();

        assertThat(calculator.getTotal(), is(600.0));
    }



}