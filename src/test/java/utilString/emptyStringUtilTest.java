package utilString;

import org.junit.jupiter.api.Test;
import util.utilString.emptyStringUtil;

import static org.junit.jupiter.api.Assertions.*;

class emptyStringUtilTest {

    @Test
    void String_null() {
        boolean result = emptyStringUtil.is_empty(null);

        assertTrue(result);
    }
    @Test
    void String_empty_with_space() {
        boolean result = emptyStringUtil.is_empty(" ");

        assertTrue(result);
    }
    @Test
    void String_empty_with_space_tab() {
        boolean result = emptyStringUtil.is_empty(" ");

        assertTrue(result);
    }
}