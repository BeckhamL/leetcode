// Solution: check if a number mod % is 0, if not we can immediately reject. If it is, divide by 3 and rerun loop
// Runtime: O(n)

func isPowerOfThree(n int) bool {

    if n == 1 {
        return true
    }

    if n <= 0 {
        return false
    }

    for i := n; i > 1; i/=3 {
        if i % 3 == 0 {
            continue
        } else {
            return false
        }
    }
    return true
}
