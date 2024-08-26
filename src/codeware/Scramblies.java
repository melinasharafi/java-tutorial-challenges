package codeware;

import java.util.List;
import java.util.stream.Collectors;

public class Scramblies {


    public static boolean scramble(String str1, String str2) {
        // Convert str1 and str2 into List<Character>
        List<Character> str1ToCharacter = str1.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> str2ToCharacter = str2.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        // check if chars at str2ToCharacter are included in str1ToCharacter
        for (Character c : str1ToCharacter) {
            if (str2ToCharacter.contains(c)) {
                str2ToCharacter.remove(c);
            }
        }

        // if str2ToCharacter is empty then portion of str1 characters can be rearranged to match str2
        if (str2ToCharacter.isEmpty()) {
            return true;
        }

        return false; // Placeholder return
    }

    public static void main(String[] args) {
        System.out.println(scramble("melina", "meli"));
    }

}
