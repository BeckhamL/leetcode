// Given an integer n, return any array containing n unique integers such that they add up to 0.
function sumZero(n: number): number[] {

    let ansArray = [];
    
    if (n === 1) {
        return [0];
    }
    
    if (n % 2 == 0) {
        // dont add 0
        for (let i = 1; i < n+1; i+=2) {
            
            let increment = i;
            let incrementNeg = i * -1;
            ansArray.push(increment);
            ansArray.push(incrementNeg);
        }
    } else {
        // add 0
        ansArray.push(0);
        for (let i = 1; i < n-1; i+=2) {
            
            let increment = i;
            let incrementNeg = i * -1;
            ansArray.push(increment);
            ansArray.push(incrementNeg);
        }
    }
    
    return ansArray;
    
};
