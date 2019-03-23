
// Very slow solution
class Solution {
    public int[] sortArrayByParityII(int[] A) {

        int[] ans = new int[A.length];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            list.add(A[i]);
        }

        for (int i = 0; i < ans.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) % 2 == 0) {
                        ans[i] = list.get(j);
                        list.remove(j);
                        break;
                    }
                }
            }
            else {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) % 2 != 0) {
                        ans[i] = list.get(j);
                        list.remove(j);
                        break;
                    }
                }
            }
        }
        return ans;
    }
}

// Much faster Solution
// Loop through input array, if element is even, add to my array at even index. Vice versa
class Solution {
    public int[] sortArrayByParityII(int[] A) {

        int[] ans = new int[A.length];

        int i = 0;

        for (int x : A) {
            if (x % 2 == 0) {
                ans[i] = x;
                i += 2;
            }
        }

        i = 1;

        for (int x : A) {
            if (x % 2 != 0) {
                ans[i] = x;
                i += 2;
            }
        }

        return ans;
    }
}
