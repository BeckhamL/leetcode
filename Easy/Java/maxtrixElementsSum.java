// Problem: Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, your task
// is to return the total sum of all rooms that are suitable for the CodeBots (ie: add up all the values that don't appear below a 0).
// Solution: Seach column by column, if a zero appears, it means all the values below are irrelevant so skip to next column.
// Rumtime: O(n^2)

int matrixElementsSum(int[][] matrix) {

    int total = 0;

    for (int i = 0; i < matrix[0].length; i++) {
        for (int j = 0; j < matrix.length; j++) {

            if (matrix[j][i] == 0) {
                break;
            }
            else {
                total = total + matrix[j][i];
            }
        }
    }
    return total;
}
