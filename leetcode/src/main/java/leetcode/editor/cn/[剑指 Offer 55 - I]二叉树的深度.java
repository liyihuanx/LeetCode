/**
 * @author liyihuanx
 * @date 2022-07-26 18:39:52
 * @Description [剑指 Offer 55 - I]二叉树的深度
 */

//leetcode submit region begin(Prohibit modification and deletion)


import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        count = count + Math.max(maxDepth(root.left),maxDepth(root.right));
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
