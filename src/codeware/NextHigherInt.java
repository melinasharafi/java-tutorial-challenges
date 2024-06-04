package codeware;

import java.util.ArrayList;

public class NextHigherInt {

// Your task is to find the next higher number (int) with same '1'- Bits.

    public static int nextHigher(int n) {
        String nInBinary = Integer.toBinaryString(n);
        int nextHigher = n;
        String nextHigherInBinary = Integer.toBinaryString(nextHigher);
        boolean check = ( countOne(nInBinary) == countOne(nextHigherInBinary) );
        while (!check) {
            nextHigher++;
        }

        return nextHigher;
    }
    public static int countOne (String intInBinary) {
        int count = 0;
        String[] parsedString = intInBinary.split("");
        for (int i = 0;i < parsedString.length; i++) {
            if (parsedString[i].equals("1"))
                count++;
        }
        return count;
    }
}
