function missingNumber(nums: number[]): number {

    // Javascript sorts alphabetically
    nums.sort((a,b) => a - b);
    
    for (let i = 0; i < nums.length; i++) {
        
        if (nums[i] !== i) {
            return i;
        } 
    }
    
    // Return length in case missing element is last
    return nums.length;
};
