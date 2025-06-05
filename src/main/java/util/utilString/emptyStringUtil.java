package util.utilString;

public class emptyStringUtil {

    public static boolean is_empty(String input) {
        //java 8-10
            /*if (input == null) {
                return true;
            }
            // trim() quita espacios en los extremos; luego reviso longitud
            return input.trim().length() == 0;*/
        //java 11+
        if (input == null || input.isBlank()) {
            return true;
        }
        return false;

    }
}
