// Solution: Keep a left and right pointer. The height is the minimum of the 2 values and the width is the distance between them (index). Find the
// area by doing height * width and check if the curr > max. We move the left and right pointer by the smaller value.
// Runtime: O(n)

class Solution {
    public int maxArea(int[] height) {

        int first = 0;
        int last = height.length -1;

        int max = 0;
        int curr = 0;

        while (first < last) {

            int h = Math.min(height[first],height[last]);
            int w = last - first;
            curr = h * w;
            max = Math.max(curr,max);

            if (height[first] < height[last]) {
                first++;
            }
            else {
                last--;
            }
        }
        return max;
    }
}
