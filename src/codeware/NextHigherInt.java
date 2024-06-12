package codeware;

public class NextHigherInt {

    // Your task is to find the next higher number (int) with same '1'- Bits.
// https://www.codewars.com/kata/56bdd0aec5dc03d7780010a5/train/java
    public static int nextHigher(int n) {
        int nextHigherInt = n + 1;

        while (!(countOne(n) == countOne(nextHigherInt))) {
            nextHigherInt++;
        }

        return nextHigherInt;
    }

    public static int countOne(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }

//    public static int countOne(int n) {
//        String nInBinary = Integer.toBinaryString(n);
//        String[] parsedString = nInBinary.split("");
//
//        int count = 0;
//
//        for (String s : parsedString) {
//            if (s.equals("1"))
//                count++;
//        }
//        return count;
//    }

    public static void main(String[] args) {
        System.out.println(countOne(127));
        System.out.println(countOne(128));
        System.out.println(nextHigher(201326592));

    }
}
