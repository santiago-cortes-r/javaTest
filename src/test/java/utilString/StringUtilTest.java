package utilString;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        assertEquals("hola", StringUtil.repeat("hola", 1) );
    }

    @Test
    public void repeat_string_mutiple_times() {
        assertEquals("holaholahola", StringUtil.repeat("hola", 3) );
    }

    @Test
    public void repeat_string_zero_times() {
        assertEquals("", StringUtil.repeat("hola", 0) );
    }

    @Test
    public void repeat_string_negative_times() {
        assertThrows(IllegalArgumentException.class,
        () -> StringUtil.repeat("hola", -1)
        );
    }

}
