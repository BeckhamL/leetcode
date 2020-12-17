/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */

function hasPathSum(root: TreeNode | null, sum: number): boolean {

    return helper(root, sum);
};

function helper(node: TreeNode, sum: number) {
    
    if (node === null) {
        return false;
    } else if (node.left === null && node.right === null && sum - node.val === 0) {
        return true;
    }  else {
        return helper(node.left, sum - node.val) || helper(node.right, sum - node.val);
    } 
}
