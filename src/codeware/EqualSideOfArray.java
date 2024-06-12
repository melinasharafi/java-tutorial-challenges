package codeware;

public class EqualSideOfArray {
    /*
    You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of
     the integers to the left of N is equal to the sum of the integers to the right of N.
    If there is no index that would make this happen, return -1.
     */

    public static int findEvenIndex(int[] arr) {
        // your code
        int sumOfLeftSide = 0;
        int sumOfRightSide = 0;
        for (int i = 0; i < arr.length; i++) {

            //find the sum of integers to the left side
            for (int j = 0; j < i; j++) {
                sumOfLeftSide += arr[j];
            }

            //find the sum of integers to the right side
            for (int k = i + 1; k < arr.length; k++) {
                sumOfRightSide += arr[k];
            }

            if (sumOfLeftSide == sumOfRightSide) {
                return i;

            }
        }
        return -1;
    }
}
