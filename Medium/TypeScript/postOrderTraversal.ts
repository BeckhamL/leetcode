function postorderTraversal(root: TreeNode | null): number[] {

    let nodes = [];
    helper(root, nodes);
    
    return nodes;
};

function helper(node: TreeNode, nodes: number[]) {
    
    if (node !== null) {
        
        if (node.left) {
            helper(node.left, nodes);
        }
        
        if (node.right) {
            helper(node.right, nodes);
        }
        
        nodes.push(node.val);
    }
}
