package codeware;

public class BreakCamelCase {

    public static String camelCase(String input) {

        StringBuilder output = new StringBuilder();

        for (char c : input.toCharArray()) {

            // change the capital letter to small letter
            if (c > 64 & c < 91) {
                c = (char) (c + 32);
                output.append(" ");
                output.append(c);
            }

            // add others letters
            output.append(c);
        }

        return output.toString();
    }

}
