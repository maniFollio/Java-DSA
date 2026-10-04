import java.util.ArrayList;
import java.util.List;

public class lc94_BinaryTreeInorderTraversal {
    public class BinaryTree {
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

        public List<Integer> postorderTraversal(TreeNode root) {
            ArrayList<Integer> result = new ArrayList<>();
            inorder(root, result);
            return result;
        }

        public void inorder(TreeNode root, ArrayList<Integer> result) {
            if (root == null) {
                return;
            }
            inorder(root.left, result);
            result.add(root.val);
            inorder(root.right, result);
        }
    }
}
