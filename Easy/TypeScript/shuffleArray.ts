function shuffle(nums: number[], n: number): number[] {

    let xArray = nums.slice(0, n);
    let yArray = nums.slice(n, nums.length);
    let ansArray = [];

    for (let i = 0; i < n; i++) {
        ansArray.push(xArray[i], yArray[i])
    }

    return ansArray;
};
