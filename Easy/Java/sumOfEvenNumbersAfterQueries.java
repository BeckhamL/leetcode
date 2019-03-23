// Solution: Loop through the queries, and add the value at the specified index. Call helper function to then iterate the list and return the sum of even numbers
// Runtime: O(n^2)

class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][1];
            int val = queries[i][0];

            A[index] = A[index] + val;
            int sum = iterate(A);
            ans[i] = sum;
        }
        return ans;
    }

    public static int iterate(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
