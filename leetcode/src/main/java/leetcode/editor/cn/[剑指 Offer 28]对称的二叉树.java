/**
 * @author liyihuanx
 * @date 2022-07-20 17:54:21
 * @Description [剑指 Offer 28]对称的二叉树
 */

//leetcode submit region begin(Prohibit modification and deletion)


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}


class Solution {
    public boolean isSymmetric(TreeNode root) {

        return root == null ? true : isSame(root.left, root.right);

    }


    public boolean isSame(TreeNode L, TreeNode R) {
        if(L == null && R == null) return true;
        if(L == null || R == null || L.val != R.val) return false;

        return isSame(L.left, R.right) && isSame(L.right, R.left);

    }


}
//leetcode submit region end(Prohibit modification and deletion)
