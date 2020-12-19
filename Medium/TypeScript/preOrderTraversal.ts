function preorderTraversal(root: TreeNode | null): number[] {

    let nodes = [];
    helper(root, nodes);
    
    return nodes;
};

function helper(node: TreeNode, nodes: number[]) {
    
    if (node !== null) {
        
        nodes.push(node.val);
        
        if (node.left) {
            helper(node.left, nodes);
        }
        
        if (node.right) {
            helper(node.right, nodes);
        }
    }
}
