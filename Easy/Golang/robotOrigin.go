import "fmt"

func judgeCircle(moves string) bool {

    var u, d, l, r int

//Note else/ else if need to be same line as bracket
    for i := range moves {
        if moves[i] == 'U' {
            u++
        } else if moves[i] == 'D' {
            d++
        } else if moves[i] == 'L' {
            l++
        } else {
            r++
        }
    }

    if (u == d && r == l) {
        return true
    } else {
        return false
    }
}
