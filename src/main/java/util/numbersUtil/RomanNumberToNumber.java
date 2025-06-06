package util.numbersUtil;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberToNumber {
    private static final Map<Character, Integer> romanMap = new HashMap<>();
    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public static int toNumber(String roman){
        if (roman == null || roman.isEmpty()) {
            throw new IllegalArgumentException("El número romano no puede ser nulo o vacío.");
        }

        int result = 0;
        int numberEvaluated = 0;

        for (int i = roman.length()-1; i>=0; i--) {

            char actualChar = roman.charAt(i);
            int actual = romanMap.getOrDefault(actualChar,-1);

            if (actual < numberEvaluated){
                result -= actual;
            }else {
                result += actual;
            }
            numberEvaluated = actual;
    }

    return result;

    }
}
