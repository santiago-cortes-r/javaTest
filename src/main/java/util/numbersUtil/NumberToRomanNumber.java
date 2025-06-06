package util.numbersUtil;

import java.util.ArrayList;

public class NumberToRomanNumber {

    public static String toRoman(int number){
        if (number <= 0 || number > 3999) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 3999");
        }

        int[] valores = {1000, 900, 500, 400, 100, 90,  50, 40,  10, 9,   5,  4,  1};
        String[] simbolos ={"M", "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder result = new StringBuilder();

        for(int i = 0; i<valores.length; i++){
            while (number>=valores[i]){
                number -= valores[i];
                result.append(simbolos[i]);
            }
        }
        return result.toString();
    }
}
