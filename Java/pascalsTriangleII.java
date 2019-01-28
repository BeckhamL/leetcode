// Solution: For sure I know there will be 1's at the end of the list. To calculate the middle elements, I get the element to the left and my current value at j. J will build up once
// rowIndex is higher. 
// Runtime: O(n)

class Solution {
    public List<Integer> getRow(int rowIndex) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            ans.add(1);
            for (int j = i-1; j > 0; j--) {
                ans.set(j, ans.get(j-1) + ans.get(j));
            }
        }
        return ans;
    }
}
