import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTreeInor {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return result;
        }
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;   //moving to the left until the root is null
            }
        root = stack.pop(); //pick the last added value from the stack, use the roor name just for transfer that value to result list
        result.add(root.val);
        root = root.right;  //continue iterate to the right until the root is null
        }
        return result;
    }
}