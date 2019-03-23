// Solution: loop through array and increment counter if we see a '1', if we see '0' check max and reset counter
// Runtime: O(n)

func findMaxConsecutiveOnes(nums []int) int {

    counter := 0
    max := 0

    for i := 0; i < len(nums); i++ {
        if nums[i] == 1 {
            counter++
        } else {
            if counter > max {
                max = counter
                counter = 0
            }
            counter = 0
        }
    }

    if counter > max {
        return counter
    }
    return max
}
