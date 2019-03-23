import "fmt"

func numJewelsInStones(J string, S string) int {
    var counter = 0

    for i := range S {
        for j := range J {
            if J[j] == S[i] {
                counter = counter + 1
            }
        }
    }
    return counter
}
