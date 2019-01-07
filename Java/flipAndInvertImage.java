// Solution: methods to flip and invert array
// Runtime: O(n)

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {

        for (int i = 0; i < A.length; i++) {
            flip(A[i]);
        }

        for (int i = 0; i < A.length; i++) {
            invert(A[i]);
        }

        return A;
    }

    public static int[] flip(int[] A) {
        int startIndex = 0;
        int endIndex = A.length-1;

        while (startIndex < endIndex) {
            int temp = A[startIndex];
            A[startIndex] = A[endIndex];
            A[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        return A;
    }

    public static int[] invert(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
        return arr;
    }
}
