import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class lclc103_BinaryTreeZigzagLevelOrderTraversal {
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

        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            boolean leftToRight = true;
            while (!q.isEmpty()) {
                int size = q.size();
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode currNode = q.remove();
                    list.add(currNode.val);

                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
                if (!leftToRight) {
                    Collections.reverse(list);
                }
                result.add(list);
                leftToRight = !leftToRight;
            }
            return result;
        }
    }
}