// Solution: add values to a hashmap, if the value doesnt exist set counter to 1
// if value exists increment the counter and check if the counter == array length/2
// hashmap get/put = O(1). Worst case in java 8 is O(log n) depending on how keys are inserted
// Runtime: O(n)
class Solution {
    public int repeatedNTimes(int[] A) {

        if (A.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        // if the value isn't added
        for (int i = 0; i < A.length; i++) {
            if (map.get(A[i]) == null) {
                map.put(A[i], 1);
            }
            // if map already contains value, increment counter
            // check if the counter == N/2
            else {
                map.put(A[i], map.get(A[i]) + 1);

                if (map.get(A[i]) == A.length/2) {
                    ans = A[i];
                }
            }
        }
        return ans;
    }
}
