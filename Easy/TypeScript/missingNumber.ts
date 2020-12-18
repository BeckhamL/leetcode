function missingNumber(nums: number[]): number {

    // Javascript sorts alphabetically so have to 
    // specific value
    nums.sort((a,b) => a - b);
    let missing = 0;
    
    for (let i = 0; i < nums.length; i++) {
        
        if (nums[i] === missing) {
            missing++;
        } 
    }
    
    return missing;
};
