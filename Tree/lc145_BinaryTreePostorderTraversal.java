import java.util.ArrayList;
import java.util.List;

public class lc145_BinaryTreePostorderTraversal {
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
            postorder(root, result);
            return result;
        }

        public void postorder(TreeNode root, ArrayList<Integer> result) {
            if (root == null) {
                return;
            }
            postorder(root.left, result);
            postorder(root.right, result);
            result.add(root.val);
        }
    }
}
