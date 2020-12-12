// Given a positive integer num consisting only of digits 6 and 9.
// Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

function maximum69Number (num: number): number {

    let currMax = num;
    let digits = Array.from(num.toString()).map(Number);
    
    for (let i = 0; i < digits.length; i++) {
        
        if (digits[i] === 6) {
            digits[i] = 9;
            let tempNum = Number(digits.join(''));
            
            if (tempNum > currMax) {
                currMax = tempNum;
            }
            
            digits[i] = 6;
        } 
    }
    
    return currMax;
};
