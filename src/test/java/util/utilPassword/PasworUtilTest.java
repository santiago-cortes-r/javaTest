package util.utilPassword;

import org.junit.jupiter.api.Test;
import util.utilPassword.PasworUtil;

import static org.junit.jupiter.api.Assertions.*;

class PasworUtilTest {

    @Test
    void weak_when_has_less_than_8_letters() {
        assertEquals(PasworUtil.SecurityLevel.WEAK,
        PasworUtil.assessPassword("123fh*&"));
    }
    @Test
    void weak_when_has_only_letters() {
        assertEquals(PasworUtil.SecurityLevel.WEAK,
                PasworUtil.assessPassword("asdrrrvdssd"));
    }
    @Test
    void medium_when_has_letters_and_numbers() {
        assertEquals(PasworUtil.SecurityLevel.MEDIUM,
                PasworUtil.assessPassword("asdr567vdssd"));
    }

    @Test
    void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(PasworUtil.SecurityLevel.STRONG,
                PasworUtil.assessPassword("asdr567vdssd*&&"));
    }

}