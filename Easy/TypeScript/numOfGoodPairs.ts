function numIdenticalPairs(nums: number[]): number {

    let map= new Map();
    let count = 0;
    
    for (let i = 0; i < nums.length; i++) {
        
        // if map has same val, if index are less count++
        if (map.has(nums[i])) {
            let val = map.get(nums[i]);
            
            for (let j = 0; j < val.length; j++) {
                if (val[j] < i) {
                    count++;
                }
            }

            val.push(i)
            map.set(nums[i], val);
            
        // if map doesn't have, add val and index into array
        } else {
            map.set(nums[i], [i]);
        }
    }
    
    return count;
};
