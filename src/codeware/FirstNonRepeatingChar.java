package codeware;

public class FirstNonRepeatingChar {

    public static String firstNonRepeatingLetter(String s) {

        String input = s.toUpperCase();
        int index = -1;

        if (input.length() == 1) {
            return s;
        }

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    index = -1;
                    break;
                }
                index = i;
            }
            if (index != -1) {
                break;
            }
        }

        if (index != -1) {
            return Character.toString(s.charAt(index));
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("moon-men"));
    }
}
