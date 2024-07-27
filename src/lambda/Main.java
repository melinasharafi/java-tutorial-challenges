package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

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

        // challenge 6
        Supplier<String> supplier = () -> {
            return "I love Java";
        };
        System.out.println(supplier.get());


        // challenge 9
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        Function<List<String>, List<String>> sortedUpperCased = names -> {
            List<String> upperCased = new ArrayList<>();
            for (String name : names) {
                upperCased.add(name.substring(0, 1).toUpperCase() + name.substring(1));
            }
            upperCased.sort((s1, s2) -> {
                return s1.compareTo(s2);
            });
            return upperCased;
        };

        List<String> result = sortedUpperCased.apply(topNames2015);
        result.forEach(name -> System.out.println(name));

    }

    // challenge 4
    private static void everySecondCharacter(Function function) {
        System.out.println(function.apply("1234567890"));
    }

}
