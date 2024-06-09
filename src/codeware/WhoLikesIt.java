package codeware;

public class WhoLikesIt {

//    Implement the function which takes an array containing the names of people that like an item.
//    It must return the display text as shown in the examples:
//
//            []                                -->  "no one likes this"
//            ["Peter"]                         -->  "Peter likes this"
//            ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
//            ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"

    public static String whoLikesIt(String... names) {

        StringBuilder whoLikesIt = new StringBuilder();

        int numberOfPeople = names.length;

        switch (numberOfPeople) {
            case 0:
                whoLikesIt.append("no one likes this");
                break;
            case 1:
                whoLikesIt.append(names[0]).append(" likes this");
                break;
            case 2:
                whoLikesIt.append(names[0]).append(" and ").append(names[1]).append(" like this");
                break;
            case 3:
                whoLikesIt.append(names[0] + ", " + names[1] + " and " + names[2] + " like this");
                break;
            default:
                whoLikesIt.append(names[0]).append(", ").append(names[1]).append(" and " + (numberOfPeople - 2) + " others like this");
                break;
        }
        return whoLikesIt.toString();
    }
}
