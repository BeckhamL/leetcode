// Runtime: O(n)

// Iterative
func fib(N int) int {

    fib := 1
    prevFib := 1

    if N <= 1 {
        return N
    }

    for i := 2; i <= N; i++ {
        temp := fib
        fib = fib + prevFib
        prevFib = temp
    }
    return fib
}
