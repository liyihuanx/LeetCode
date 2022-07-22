/**
 * @author liyihuanx
 * @date 2022-07-07 19:03:59
 * @Description [剑指 Offer II 052]展平二叉搜索树
 */

//leetcode submit region begin(Prohibit modification and deletion)


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

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
    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        // 先把左右子树拉平
        TreeNode left = increasingBST(root.left);
        root.left = null;
        TreeNode right = increasingBST(root.right);
        root.right = right;

        // 左子树为空的话，就不用处理了
        if (left == null) {
            return root;
        }

        // 左子树非空，需要把根节点和右子树接到左子树末尾
        TreeNode p = left;
        while (p != null && p.right != null) {
            p = p.right;
        }

        p.right = root;

        return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
