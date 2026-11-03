/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr == null) {
                continue;
            }

            if (curr.val == subRoot.val) {
                if (iterateTree(curr, subRoot)) return true;
            }
            q.add(curr.left);
            q.add(curr.right);

        }


        return false;
    }



    public boolean iterateTree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            if (root == null) {
                return true;
            } else {
                return false;
            }
        }

        if (root == null) {
            return false;
        }

        if (subRoot.val != root.val) {
            return false;
        }

        return iterateTree(root.left, subRoot.left) && iterateTree(root.right, subRoot.right);


    }
}
