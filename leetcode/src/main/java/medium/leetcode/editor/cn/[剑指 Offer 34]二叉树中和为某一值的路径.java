/**
 * @author liyihuanx
 * @date 2022-08-09 20:41:46
 * @Description [剑指 Offer 34]二叉树中和为某一值的路径
 */

//leetcode submit region begin(Prohibit modification and deletion)

import java.util.LinkedList;
import java.util.List;

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
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) return res;

        traverse(root, target, new LinkedList<>());
        return res;
    }


    public void traverse(TreeNode root, int target, LinkedList<Integer> path) {
        if (root == null) return;

        int remind = target - root.val;

        if (root.left == null && root.right == null) {
            if (remind == 0) {
                path.addLast(root.val);
                res.add(new LinkedList<>(path));
                path.removeLast();
            }
            return;
        }

        path.addLast(root.val);
        traverse(root.left, remind, path);
        path.removeLast();


        path.addLast(root.val);
        traverse(root.right, remind, path);
        path.removeLast();

    }
}
//leetcode submit region end(Prohibit modification and deletion)
