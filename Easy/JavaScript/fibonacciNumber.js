/**
 * @param {number} N
 * @return {number}
 */
 // Recursive solution
var fib = function(N) {

    if (N <= 1) {
        return N;
    }

    return fib(N-1) + fib(N-2);
};

// Iterative solution
var fib = function(N) {

    if (N <= 1) {
        return N;
    }

    let fib = 1;
    let prevFib = 1;

    for (i = 2; i < N; i++) {
        let temp = fib;
        fib = prevFib + fib;
        prevFib = temp;
    }
    return fib;
};
