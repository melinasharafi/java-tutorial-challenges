package codeware;

import java.lang.reflect.Array;
import java.util.*;

public class DirReduction {

    private static Map<String, Integer> direction = new HashMap<>();

    static {
        direction.put("NORTH", 1);
        direction.put("SOUTH", -1);
        direction.put("WEST", 2);
        direction.put("EAST", -2);
    }

    public static String[] dirReduc(String[] arr) {

        List<String> finalDirection = new ArrayList<>(Arrays.asList(arr));

        while (!isDirectlyOpposite(finalDirection)) {
            for (int i = 0; i < finalDirection.size() - 2; i++) {
                int iValue = direction.get(finalDirection.get(i));
                int iPlus1Value = direction.get(finalDirection.get(i + 1));

                if (iValue + iPlus1Value == 0) {
                    finalDirection.remove(finalDirection.get(i + 1));
                    finalDirection.remove(finalDirection.get(i));
                    i--;
                }
            }
        }

        return finalDirection.toArray(new String[0]);
    }

    public static boolean isDirectlyOpposite(List<String> dirctionList) {

        for (int i = 0; i < dirctionList.size() - 1; i++) {
            if (direction.get(dirctionList.get(i)) + direction.get(dirctionList.get(i + 1)) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] directions = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        String[] finalDirections = dirReduc(directions);
        for (String dir : finalDirections) {
            System.out.print(dir + " ");
        }
    }
}
