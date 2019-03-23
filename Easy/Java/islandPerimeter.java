// Solution: Loop through the arrays and check is surrounding is an island, if it is removed the total perimeter by 1. Remember to do the checks (e.g. not checking if first row has island above)
// Runtime: O(n^2)

class Solution {
    public int islandPerimeter(int[][] grid)
    {
        int perimeter = 0;

        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {

                int t=0;
                if(grid[i][j]==1) {
                    t=4;

                    // if value above is an island
                    if(i > 0 && grid[i-1][j]==1)
                        t--;
                    // if value below is an island
                    if(i < grid.length-1 && grid[i+1][j]==1)
                        t--;
                    // if value to left is an island
                    if(j >= 1 && grid[i][j-1]==1)
                        t--;
                    // if value to right is an islan
                    if(j < grid[i].length-1 && grid[i][j+1]==1)
                        t--;

                    perimeter = perimeter + t;

                }
            }
        }
        return perimeter;
    }
}
