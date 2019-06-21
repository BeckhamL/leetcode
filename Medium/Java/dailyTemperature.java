class Solution {
    public int[] dailyTemperatures(int[] T) {

        int[] ans = new int[T.length];

        for (int i = 0; i < T.length; i++) {
            for (int j = i+1; j < T.length; j++) {
                if (T[j] > T[i]) {
                    ans[i] = j-i;
                    break;
                }
            }
        }

        return ans;
    }
}
