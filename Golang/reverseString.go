// Solution: set 2 pointers and turn string in array of runes. Loop through and keep swapping
// Runtime: O(log n)

func reverseString(s string) string {

    var first = 0
    var last = len(s) - 1
    a := []rune(s)

    for first < last {
        a[first], a[last] = a[last], a[first]
        first++
        last--
    }

    return string(a)
}
