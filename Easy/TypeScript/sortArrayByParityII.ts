function sortArrayByParityII(A: number[]): number[] {

    let evenArray = [];
    let oddArray = [];
    let ansArray = new Array(A.length);
    let counter = 0;
    
    A.forEach(num => {
        
        if (num % 2 === 0) {
            evenArray.push(num)
        } else {
            oddArray.push(num);
        }
    });
    
    for (let i = 0; i < A.length; i+=2) {
        ansArray[i] = evenArray[counter++];
    }
    
    counter = 0;
    
    for (let i = 1; i < A.length; i+=2) {
        ansArray[i] = oddArray[counter++];
    }
    
    return ansArray;
};
