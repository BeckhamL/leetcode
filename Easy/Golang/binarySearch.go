// Solution: keeping halfing the search size. if the mid is larger than the target, move high vice versa
// Runtime: O(log n)
func search(nums []int, target int) int {

    low := 0
    high := len(nums) - 1

    for low <= high {

        mid := low + (high-low)/2

        if (nums[mid] == target) {
            return mid
        } else if nums[mid] > target {
            high = mid - 1
        } else {
            low = mid + 1
        }
    }
    return -1
}
