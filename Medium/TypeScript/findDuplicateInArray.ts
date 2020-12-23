// Modifying array
function findDuplicate(nums: number[]): number {
    
    nums.sort((a,b) => a-b);
    
    for (let i = 0; i < nums.length - 1; i++) {
        let next = i+1;
        
        if (nums[i] === nums[i+1]) {
            return nums[i];
        }
    }
};

// Without modifying array
function findDuplicate(nums: number[]): number {
    
    let map = new Map();
    
    for (let i = 0; i < nums.length; i++) {
        
        if (map.has(nums[i])) {
            
            let val = map.get(nums[i]);
            val++;
            map.set(nums[i], val);
        } else {
            map.set(nums[i], 1);
        }
    }
    
    for (let [key,value] of map) {
        
        if (value >= 2) {
            return key;
        }
    }
};
