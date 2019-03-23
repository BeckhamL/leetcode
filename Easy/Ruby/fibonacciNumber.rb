# @param {Integer} n
# @return {Integer}
def fib(n)

    if n <= 1
        return n
    end

    return fib(n-1) + fib(n-2)
end

# Iterative solution

def fib(n)

    if n <= 1
        return n
    end

    fib = 1
    prevFib = 1

    i = 2

    while i < n
        temp = fib
        fib = prevFib + fib
        prevFib = temp
        i+=1
    end

    return fib

end
