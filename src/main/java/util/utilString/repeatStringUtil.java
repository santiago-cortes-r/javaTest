package util.utilString;

public class repeatStringUtil {

    public static String repeat(String str, int times) {

        if (times < 0){
            throw new IllegalArgumentException("negative times not allowed");
        }
        String result = "";


        for (int i = 0; i < times; i++) {
            result += str;
        }

        return result;
    }
}