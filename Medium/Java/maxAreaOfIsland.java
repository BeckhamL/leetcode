// Solution: Loop through the array. If I see a one, call the helper recursive function
// and if in either direction there is another 1, change the land to 0 and increment the count.
// Get the max and change all the 1's in the recursive call to 0 so we dont double count.
// Runtime: O(n^2)

class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int max = 0;

        for (int i = 0; i < grid.length;i++) {
            for (int j = 0; j < grid[i].length;j++) {

                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(grid,i,j));
                }
            }
        }
        return max;
    }

    public static int dfs(int[][]grid, int i, int j) {

        if (i < 0 || j < 0 || i > grid.length-1 || j > grid[i].length-1 || grid[i][j] == 0) {
            return 0;
        }

        grid[i][j] = 0;
        int count = 1;

        count+=dfs(grid, i-1,j);
        count+=dfs(grid,i+1,j);
        count+=dfs(grid,i,j+1);
        count+=dfs(grid,i,j-1);

        return count;
    }
}
