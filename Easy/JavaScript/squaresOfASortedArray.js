/**
 * @param {number[]} A
 * @return {number[]}
 */
var sortedSquares = function(A) {
    
    let ans = new Array(A.length);
    
    for (let i = 0; i < A.length; i++) {
        ans[i] = A[i] * A[i];
    }
    
    return ans.sort((a,b) => a-b);
};
