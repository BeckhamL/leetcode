function bitwiseComplement(N: number): number {

    let binary = N.toString(2);
    let complementBinary = [];
    let sum = 0;
    let exponent = 0;
    
    for (let i = 0; i < binary.length; i++) {
        if (binary.charAt(i) === '0') {
            complementBinary.push('1');
        } else {
            complementBinary.push('0');
        }
    }

    for (let i = complementBinary.length - 1; i >= 0; i--) {
        
        if (complementBinary[i] === '1') {
            sum = sum + Math.pow(2,exponent);
        }
        exponent++;
    }
    
    return sum;
};
