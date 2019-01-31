// Solution: Sort the numbers first, since there are no duplicates besides the duplicating number, if 2 numbers next to each other are the same return that number
// Runtime: O(n)

func findDuplicate(nums []int) int {

    sort.Ints(nums)

    for i := 0; i < len(nums); i++ {
        if nums[i] == nums[i+1] {
            return nums[i]
        }
    }
    return 0
}
