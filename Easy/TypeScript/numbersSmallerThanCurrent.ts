// Slow O(n)^2 version double loop
function smallerNumbersThanCurrent(nums: number[]): number[] {

    let ansArray = [];
    let count = 0;
    
    for (let i = 0; i < nums.length; i++) {
        let count = 0;
        for (let j = 0; j < nums.length; j++) {
            if (i !== j && nums[j] < nums[i]) {
                count++;
            }
        }
        ansArray.push(count);
    }
    
    return ansArray;
};

// n(log(n)) sort and use map to keep track of num, index. Index represents number smaller
function smallerNumbersThanCurrent(nums: number[]): number[] {

    let map = new Map();
    let copy = [...nums];
    copy.sort((a,b) => a-b);
    let ansArray = [];
    
    for (let i = 0; i < copy.length; i++) {
        
        // If number is already in map don't replace since we want min value
        // e.g. [8,1,2,2,3] the second '2'
        if (!map.has(copy[i])) {
            map.set(copy[i], i);
        }
    }
    
    for (let i = 0; i < nums.length; i++) {
       
        let val = map.get(nums[i]);
        ansArray.push(val);
    }
    
    return ansArray;
};
