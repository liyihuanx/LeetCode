/**
 * @author liyihuanx
 * @date 2022-07-19 18:13:28
 * @Description [剑指 Offer 27]二叉树的镜像
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

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public TreeNode mirrorTree(TreeNode root) {

        if (root == null) return null;

        TreeNode tempL = mirrorTree(root.left);

        TreeNode tempR = mirrorTree(root.right);


        root.left = tempR;
        root.right = tempL;


        return root;

    }




}
//leetcode submit region end(Prohibit modification and deletion)
