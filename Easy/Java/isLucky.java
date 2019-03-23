// Problem: Ticket numbers usually consist of an even number of digits.
// A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
// Solution: The solution is similar to finding a pivot index. I check if the left side is equal to the right side. All the stuff before the for loop
// is making the int an int array.
// Runtime: O(n)

boolean isLucky(int n) {

    int length = Integer.toString(n).length();

    int[] arr = new int[length];
    int counter = 0;

    int leftSum = 0;
    int sum = 0;

    while (n > 0) {
        arr[counter] = n % 10;
        sum = sum + (n % 10);
        n = n/10;
        counter++;
    }

    for (int i = 0; i < arr.length; i++) {

        if (leftSum == sum - leftSum) {
            return true;
        }
        else {
            leftSum += arr[i];
        }
    }

    return false;
}
