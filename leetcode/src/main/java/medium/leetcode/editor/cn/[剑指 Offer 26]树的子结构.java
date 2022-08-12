/**
 * @author liyihuanx
 * @date 2022-08-04 19:00:00
 * @Description [剑指 Offer 26]树的子结构
 */

//leetcode submit region begin(Prohibit modification and deletion)

public class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

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
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;

        // 根节点匹配成功，就向下寻找
        if (A.val == B.val && compareTree(A, B)) {
            return true;
        }

        // 没匹配成功，在用左右子节点匹配
        return isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean compareTree(TreeNode a, TreeNode b) {
        // 因为只有一直匹配才能一直递归进来，一直到b是null，说明是完全一致的
        if (b == null) {
            return true;
        }

        // b有，a没有，说明不匹配
        if (a == null) {
            return false;
        }

        // 子节点值不相等也不行
        if (b.val != a.val) {
            return false;
        }

        // 到这里说明，节点是相等的，所以继续比较左右子节点
        return compareTree(a.left, b.left) && compareTree(a.right, b.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
