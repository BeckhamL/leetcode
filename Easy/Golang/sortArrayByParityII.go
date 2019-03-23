// Solution: loop through array and if value is even, insert in even index vice versa.
// Runtime: O(n)

func sortArrayByParityII(A []int) []int {

    length := len(A)
    ans := make([]int, length)

    j := 1
    // fill in odds
    for i := 0; i < len(A); i++ {
        if A[i] % 2 != 0 {
            ans[j] = A[i]
            j+=2
        }
    }

    j = 0
    // fill in evens
    for i := 0; i < len(A); i++ {
        if A[i] % 2 == 0 {
            ans[j] = A[i]
            j+=2
        }
    }
    return ans
}
