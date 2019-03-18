// Problem: Given an array with both +ive and -ive integers, return a pair with highest product.
// Solution: If there are no negetiaves, max will be the last 2 elements. If there are negatives, see if last and first are the largest or first 2 elements.
// Runtime: O(n log n)

import java.util.*;

public class MyClass {
    public static void main(String args[]) {

        int[] test = {-1, -3, -4, 2, 0, -5};

        System.out.println(maxProduct(test));
    }

    public static int maxProduct(int[] arr) {

        Arrays.sort(arr);

        int positive = arr[arr.length-1] * arr[arr.length-2];
        int negative = Math.max(arr[arr.length-1] * arr[0], arr[1] * arr[0]);

        return Math.max(positive, negative);
    }
}
