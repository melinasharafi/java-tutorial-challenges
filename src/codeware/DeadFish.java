package codeware;

import java.util.ArrayList;

public class DeadFish {

//    Write a simple parser that will parse and run Deadfish.
//
//    Deadfish has 4 commands, each 1 character long:
//
//    i increments the value (initially 0)
//    d decrements the value
//    s squares the value
//    o outputs the value into the return array
//    Invalid characters should be ignored.
//    Deadfish.parse("iiisdoso") =- new int[] {8, 64};

    public static int[] parse(String data) {

        ArrayList<Integer> values = new ArrayList<>();

        int initialValue = 0;

        String[] chars = data.split("");

        for (int i = 0; i < chars.length; i++) {

            switch (chars[i]) {
                case "i":
                    initialValue++;
                    break;
                case "d":
                    initialValue--;
                    break;
                case "s":
                    initialValue = initialValue * initialValue;
                    break;
                case "o":
                    values.add(initialValue);
                    break;
                default:
                    break;
            }
        }

        int[] returningValue = new int[values.size()];

        for (int i = 0; i < values.size(); i++) {
            returningValue[i] = values.get(i);
        }

        return returningValue;
    }
}
