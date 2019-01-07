// Solution: method that reverses array and method that inverts it. Very intuitive
// Runtime: O(n)

func flipAndInvertImage(A [][]int) [][]int {

    for i := 0; i < len(A); i++ {
        reverseArray(A[i])
    }

    for i := 0; i < len(A); i++ {
        invertArray(A[i])
    }
    return A
}

func reverseArray(arr []int)[]int {

    low := 0
    high := len(arr)-1

    for low < high {
        arr[low], arr[high] = arr[high], arr[low]
        low++
        high--
    }
    return arr
}

func invertArray(arr []int)[]int {

    for i := 0; i < len(arr); i++ {
        if (arr[i] == 1) {
            arr[i] = 0
        } else {
            arr[i] = 1
        }
    }
    return arr
}
