package codeware;

import java.util.*;

public class DirReduction {

    private static Map<String, Integer> directions = new HashMap<>();

    static {
        directions.put("NORTH", 1);
        directions.put("SOUTH", -1);
        directions.put("WEST", 2);
        directions.put("EAST", -2);
    }

    public static String[] dirReduc(String[] arr) {

        Stack<String> finalDirection = new Stack<>();
        int result;

        for (String direction : arr) {
            if (!finalDirection.isEmpty()) {
                result = directions.get(finalDirection.peek()) + directions.get(direction);
                if (result == 0 ) {
                    finalDirection.pop();
                }
                else {
                    finalDirection.push(direction);
                }
            }
            else {
                finalDirection.push(direction);
            }
        }

        return finalDirection.toArray(new String[0]);
    }



    public static void main(String[] args) {
        String[] directions = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        String[] finalDirections = dirReduc(directions);
        for (String dir : finalDirections) {
            System.out.print(dir + " ");
        }
    }
}
