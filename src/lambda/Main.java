package lambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        // challenge 1
        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };


        // challenge 2
        Function<String, String> s = (String source) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        // challenge 3
        System.out.println(s.apply("1234567890 "));


        // challenge 4
        everySecondCharacter(s);
    }

    // challenge 4
    private  static void everySecondCharacter(Function function) {
        System.out.println(function.apply("1234567890"));
    }
}
