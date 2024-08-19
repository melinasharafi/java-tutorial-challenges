package codeware;

import java.util.ArrayList;
import java.util.List;

public class TripleTrouble {
    public static int TripleDouble(long num1, long num2) {

        Boolean check = false;
        char tripleChar = 0;
        String num1ToString = Long.toString(num1);
        String num2ToString = Long.toString(num2);

        for (int i = 0; i < num1ToString.length() - 2; i++) {
            if (num1ToString.charAt(i) == num1ToString.charAt(i + 1) && num1ToString.charAt(i) == num1ToString.charAt(i + 2)) {
                tripleChar = num1ToString.charAt(i);
                break;
            }
        }

        for (int i = 0; i < num2ToString.length() - 1; i++) {
            if (num2ToString.charAt(i) == num2ToString.charAt(i + 1) && num2ToString.charAt(i) == tripleChar) {
                check = true;
                break;
            }
        }

        if (check) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(TripleDouble(451999277, 47722899));
    }
}
