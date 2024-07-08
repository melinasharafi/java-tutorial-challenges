package codeware;
public class EqualSideOfArray {

    /*
    You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of
     the integers to the left of N is equal to the sum of the integers to the right of N.
    If there is no index that would make this happen, return -1.
     */
    public static int findEvenIndex(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            // hole the summation for each element of arr
            int sumOfRightSide = 0;
            int sumOfLeftSide = 0;
            // summation of right side
            for (int j = (i + 1); j < arr.length; j++) {
                sumOfRightSide = sumOfRightSide + arr[j];
            }

            // summation of left side
            for (int k = 0; k < i; k++) {
                sumOfLeftSide = sumOfLeftSide + arr[k];
            }

            // check if the sumOfRightSide and sumOfLeftSide are equal or not
            if (sumOfLeftSide == sumOfRightSide) {
                return i;
            }
        }

        return -1;
    }
}