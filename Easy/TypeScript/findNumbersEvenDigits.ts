function findNumbers(nums: number[]): number {

    let count = 0;
    
    nums.forEach(num => {
        
        let str = num.toString();
        if (str.length % 2 === 0) {
            count++;
        }
    });
    
    return count;
};
