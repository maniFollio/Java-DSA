import java.util.List;
public class BinaryTree {
    static class TreeNode  {
        int val;
        TreeNode  left;
        TreeNode  right;

        TreeNode (int data) {
            this.left = null;
            this.right = null;
            this.val = data;
        }
    }

    static class binaryTreeYT {
        static int idx = -1;

        public static TreeNode  buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            TreeNode  newNode = new TreeNode (nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preorder(TreeNode  root) {
            if (root == null) {
                return;
            }
            System.out.print(root.val + "  ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, -1, -1, 3, -1, -1 };
        binaryTreeYT tree = new binaryTreeYT();
        TreeNode  root = tree.buildTree(nodes);
        System.out.println(root.val);
        tree.preorder(root);
    }

}
