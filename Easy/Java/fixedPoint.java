// Solution: Sort the array and if i == A[i] return
// Runtime: O(nlogn)
class Solution {
    public int fixedPoint(int[] A) {

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if(A[i] == i) {
                return i;
            }
        }

        return -1;
    }
}
