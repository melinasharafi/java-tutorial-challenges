package codeware;

public class NextHigherInt {

// Your task is to find the next higher number (int) with same '1'- Bits.
// https://www.codewars.com/kata/56bdd0aec5dc03d7780010a5/train/java

//    public static int nextHigher(int n) {
//        String nInBinary = Integer.toBinaryString(n);
//        int nextHigher = n + 1;
//        String nextHigherInBinary = Integer.toBinaryString(nextHigher);
//        boolean check = true;
//        while (check) {
//            if (countOne(nInBinary) == countOne(nextHigherInBinary)) {
//                break;
//            }
//            nextHigher++;
//
//        }
//        return nextHigher;
//    }

    public static int countOne(int n) {
        String nInBinary = Integer.toBinaryString(n);
        int count = 0;
        String[] parsedString = nInBinary.split("");
        for (String s : parsedString) {
            if (s.equals("1"))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOne(127));
        System.out.println(countOne(128));
    }
}
