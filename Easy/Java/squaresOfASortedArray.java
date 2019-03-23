// Solution: Loop through the array and get the absolute value. Then square.
// Runtime: O(n)

class Solution {
    public int[] sortedSquares(int[] A) {

        for (int i = 0; i < A.length; i++) {
            int val = Math.abs(A[i]);
            A[i] = val * val;
        }

        Arrays.sort(A);

        return A;
    }
}
