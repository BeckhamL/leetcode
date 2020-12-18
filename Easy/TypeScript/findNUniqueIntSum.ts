function sumZero(n: number): number[] {

    let ansArray = [];
    
    if (n === 1) {
        return [0];
    }
    
    if (n % 2 == 0) {
        // dont add 0
        // +=2 because im adding 2 values per iteration
        for (let i = 1; i < n; i+=2) {
            
            let increment = i;
            let incrementNeg = i * -1;
            ansArray.push(increment);
            ansArray.push(incrementNeg);
        }
    } else {
        // add 0
        ansArray.push(0);
        
        // +=2 because im adding 2 values per iteration
        for (let i = 1; i < n; i+=2) {
            
            let increment = i;
            let incrementNeg = i * -1;
            ansArray.push(increment);
            ansArray.push(incrementNeg);
        }
    }
    
    return ansArray;
    
};
