// Solution: Loop through the array. If I see a one, increment the island count and call a helper method to check all directions.
// If I encounter a 1, change the value to 0 since we dont want to double count islands. We do this recursively for all 1's that are connected
// Runtime: O(n)

class Solution {
    public int numIslands(char[][] grid) {

        if (grid == null) {
            return 0;
        }

        int numIslands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] == '1') {
                    numIslands++;
                    changeLandToWater(grid, i, j);
                }
            }
        }

        return numIslands;
    }

    public static void changeLandToWater(char[][] grid, int i, int j) {

        // Because we are calling recursively, I need to make sure we dont go out of bounds.
        if (i < 0 || j < 0 || i > grid.length-1 || j > grid[0].length-1 || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        // Down
        changeLandToWater(grid, i-1,j);
        // Up
        changeLandToWater(grid, i+1,j);
        // Left
        changeLandToWater(grid, i, j-1);
        // Right
        changeLandToWater(grid, i,j+1);

    }
}
