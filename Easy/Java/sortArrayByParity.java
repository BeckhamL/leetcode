class Solution {
    public int[] sortArrayByParity(int[] A) {
        int counter = A.length;
        int temp;

        for (int i = 0; i < counter; i++) {
            if (A[i] % 2 == 0) {
                continue;
            }
            // This doesn't preserve the ordering but follows parity
            else {
                temp = A[i];
                A[i] = A[counter-1];
                A[counter-1] = temp;
                i--;
                counter--;
            }
        }
        return A;
    }
}
