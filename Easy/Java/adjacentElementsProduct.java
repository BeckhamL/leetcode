// Question: Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
// Solution: start with an initial max, then iterate through the array and keep updating the max
// Runtime: O(n)

int adjacentElementsProduct(int[] inputArray) {

    int max = inputArray[0] * inputArray[1];

    for (int i = 2; i < inputArray.length; i++) {

        int curr = inputArray[i-1] * inputArray[i];
        max = Math.max(max, curr);

    }
    return max;
}
