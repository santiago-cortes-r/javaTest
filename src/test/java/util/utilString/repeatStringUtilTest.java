package util.utilString;


import org.junit.jupiter.api.Test;
import util.utilString.repeatStringUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class repeatStringUtilTest {

    @Test
    public void repeat_string_once() {

        assertEquals("hola", repeatStringUtil.repeat("hola", 1) );
    }

    @Test
    public void repeat_string_mutiple_times() {

        assertEquals("holaholahola", repeatStringUtil.repeat("hola", 3) );
    }

    @Test
    public void repeat_string_zero_times() {

        assertEquals("", repeatStringUtil.repeat("hola", 0) );
    }

    @Test
    public void repeat_string_negative_times() {
        assertThrows(IllegalArgumentException.class,
        () -> repeatStringUtil.repeat("hola", -1)
        );
    }

}
