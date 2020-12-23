function searchInsert(nums: number[], target: number): number {
    
    if (nums.length === 0) {
        return 0;
    }    
    
    // If I find index, return
    // if the element I look at is bigger, im in right spot since sorted
    for (let i = 0; i < nums.length; i++) {
        
        if (nums[i] === target) {
            return i;
        } else if (target < nums[i]) {
            return i;
        }
        
    }
    
    // If those 2 cases fail, it must mean target is largest element
    return nums.length;
    
};
