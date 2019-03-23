// Solution: Naive way to iterate through half of the elements
// Runtime: O(n)

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int mguess = n/2;

        while (true) {
            if (guess(mguess) == 0) {
                break;
            }
            else if (guess(mguess) == 1) {
                mguess++;
            }
            else {
                mguess--;
            }
        }
        return mguess;
    }
}

// Solution: binary search approach
// Runtime: O(log n)

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int low = 1;
        int high = n;
        int mguess = 0;

        while (low <= high) {

            mguess = low + (high - low) / 2;

            if (guess(mguess) == 0) {
                break;
            }
            else if (guess(mguess) == 1) {
                low = mguess + 1;
            }
            else {
                high = mguess -1;
            }
        }

        return mguess;
    }
}
