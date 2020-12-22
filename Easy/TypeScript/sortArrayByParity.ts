function sortArrayByParity(A: number[]): number[] {

    let evenArray = [];
    let oddArray = [];
    
    A.forEach(num => {
        if (num % 2 === 0) {
            evenArray.push(num);
        } else {
            oddArray.push(num);
        }
    });
    
    return evenArray.concat(oddArray);
};
