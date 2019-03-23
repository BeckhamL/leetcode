import "jmt"

func peakIndexInMountainArray(A []int) int {

    var max = 0
    var index = 0

    for i := 0; i < len(A); i++ {
        if (A[i] > max) {
            max = A[i]
            index = i
        }
    }
    return index
}
