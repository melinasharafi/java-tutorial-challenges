package codeware;

import java.lang.reflect.Array;
import java.util.*;

public class DirReduction {


    public static String[] dirReduc(String[] arr) {

        List<String> finalDirection = new ArrayList<>(Arrays.asList(arr));

        Map<String, Integer> direction = new HashMap<>();
        direction.put("NORTH", 1);
        direction.put("SOUTH", -1);
        direction.put("WEST", 2);
        direction.put("EAST", -2);

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

        return (String[]) finalDirection.toArray();
    }

    public static boolean isDirectlyOpposite(List<String> dirctionList) {

        Map<String, Integer> direction = new HashMap<>();
        direction.put("NORTH", 1);
        direction.put("SOUTH", -1);
        direction.put("WEST", 2);
        direction.put("EAST", -2);

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
