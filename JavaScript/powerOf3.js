// Solution: check if a number mod % is 0, if not we can immediately reject. If it is, divide by 3 and rerun loop
// Runtime: O(n)

var isPowerOfThree = function(n) {

    if (n <= 0) {
        return false;
    }

    if (n == 1) {
        return true;
    }

    while (n > 1) {
        if (n % 3 == 0) {
            n = n / 3;
        }
        else {
            return false;
        }
    }
    return true;
};
