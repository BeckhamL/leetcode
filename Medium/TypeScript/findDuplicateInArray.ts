function findDuplicate(nums: number[]): number {
    
    nums.sort((a,b) => a-b);
    
    for (let i = 0; i < nums.length -1; i++) {
        let next = i+1;
        
        if (nums[i] === nums[i+1]) {
            return nums[i];
        }
    }
};
