// Solution: keep track of the previous element, if the current > previous increment the counter
// Runtime: O(n)

func findLengthOfLCIS(nums []int) int {

    if nums == nil || len(nums) == 0 {
        return 0
    }

    prev := nums[0]
    max := 1
    counter := 1

    for i := 1; i < len(nums); i++ {
        if nums[i] > prev {
            counter++
            prev = nums[i]
        } else {
            counter = 1
            prev = nums[i]
        }

        if counter > max {
            max = counter
        }
    }
    return max
}
