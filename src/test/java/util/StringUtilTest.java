package util;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilTest {

    @Test
    public void testRepeat() {


        assertEquals("holaholahola", StringUtil.repeat("hola", 3) );
        assertEquals("hola", StringUtil.repeat("hola", 1) );
    }


}
