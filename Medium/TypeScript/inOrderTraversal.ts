function inorderTraversal(root: TreeNode | null): number[] {
  let nodes = [];
  helper(root, nodes);

  return nodes;
}

function helper(node: TreeNode, nodes: number[]) {
  if (node !== null) {
    if (node.left) {
      helper(node.left, nodes);
    }
    nodes.push(node.val);

    if (node.right) {
      helper(node.right, nodes);
    }
  }
}
