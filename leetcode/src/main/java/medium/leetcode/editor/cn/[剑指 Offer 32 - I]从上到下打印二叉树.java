import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liyihuanx
 * @date 2022-08-05 16:46:49
 * @Description [剑指 Offer 32 - I]从上到下打印二叉树
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
    public int[] levelOrder(TreeNode root) {

        if(root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<TreeNode>(){{ add(root); }};
        ArrayList<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            ans.add(node.val);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        int[] res = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            res[i] = ans.get(i);
        return res;


    }
}
//leetcode submit region end(Prohibit modification and deletion)
