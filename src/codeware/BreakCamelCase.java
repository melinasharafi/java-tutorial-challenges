package codeware;

public class BreakCamelCase {

    public static String camelCase(String input) {

        StringBuilder output = new StringBuilder();

        for (char c : input.toCharArray()) {

            // change the capital letter to small letter
            if (c > 64 & c < 91) {
                output.append(" ");
                output.append(c);
            }

            // add others letters
            else {
                output.append(c);
            }
        }

        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCase("melinaSharafi"));
    }

}
