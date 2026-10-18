import java.util.List;
import java.util.ArrayList;

public class lc113_pathSumII {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.left = null;
            this.right = null;
            this.val = data;
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();

        // Start DFS from the root
        findPaths(root, targetSum, currentPath, result);

        return result;
    }

    private void findPaths(TreeNode node, int remainingSum, List<Integer> currentPath, List<List<Integer>> result) {
        // Base case: if node is null, return immediately
        if (node == null) {
            return;
        }

        // Add current node's value to the path tracking list
        currentPath.add(node.val);

        // Check if the current node is a leaf and matches the remaining sum requirement
        if (node.left == null && node.right == null && node.val == remainingSum) {
            // We must create a new ArrayList instance because currentPath is mutated during
            // backtracking
            result.add(new ArrayList<>(currentPath));
        } else {
            // Otherwise, recursively explore left and right subtrees
            findPaths(node.left, remainingSum - node.val, currentPath, result);
            findPaths(node.right, remainingSum - node.val, currentPath, result);
        }

        // Backtrack: Remove the current node from the path before returning to the
        // parent node
        currentPath.remove(currentPath.size() - 1);
    }

}