// Recursive
function fib(n: number): number {
    
    if (n > 1) {
        return fib(n-1) + fib(n-2);
    } else {
        return n;
    }
    
};

// Iteratively
function fib(n: number): number {
    
    if (n <= 1) {
        return n;
    }
    
    let counter = 0;
    let sum = 1;
    let prev = 1;
    
    // n-2 since we start at second sequence of fib
    while (counter < n - 2) {
        let temp = sum;
        sum = sum + prev;
        prev = temp;
        counter++;
    }
    
    return sum;
};
