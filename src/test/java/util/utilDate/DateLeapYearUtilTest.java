package util.utilDate;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;


class DateYearUtilShould {
    @Test
    void return_true_when_year_is_divisible_by_400() {

        assertThat(DateYearUtil.isLeapYear(1600), is(true));
        assertThat(DateYearUtil.isLeapYear(2000), is(true));
        assertThat(DateYearUtil.isLeapYear(2400), is(true));
    }

    @Test
    void return_false_when_year_is_divisible_by_100_but_not_by_400() {

        assertThat(DateYearUtil.isLeapYear(1700), is(false));
        assertThat(DateYearUtil.isLeapYear(1800), is(false));
        assertThat(DateYearUtil.isLeapYear(1900), is(false));
    }

    @Test
    void return_true_when_year_is_divisible_by_4_but_not_by_100() {

        assertThat(DateYearUtil.isLeapYear(1996), is(true));
        assertThat(DateYearUtil.isLeapYear(2004), is(true));
        assertThat(DateYearUtil.isLeapYear(2008), is(true));
    }

    @Test
    void return_false_when_year_is_not_divisible_by_4() {

        assertThat(DateYearUtil.isLeapYear(2017), is(false));
        assertThat(DateYearUtil.isLeapYear(2018), is(false));
        assertThat(DateYearUtil.isLeapYear(2019), is(false));
    }
}