public class lc101_SymmetricTree {
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

    public boolean isSymmetric(TreeNode root) {
        return isMirrorTree(root.left, root.right);
    }

    boolean isMirrorTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isMirrorTree(p.left, q.right) && isMirrorTree(p.right, q.left);
    }
}
