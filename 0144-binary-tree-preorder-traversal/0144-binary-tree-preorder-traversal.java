/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arrlist = new ArrayList<>();

        preorder(root, arrlist);
        return arrlist;
    }

    private void preorder(TreeNode node, List<Integer> arrlist) {
        if (node == null) {
            return;
        }

        arrlist.add(node.val);
        preorder(node.left, arrlist);
        preorder(node.right, arrlist);

    }
}