/**
 * @author liyihuanx
 * @date 2022-07-26 18:46:20
 * @Description [剑指 Offer 36]二叉搜索树与双向链表
 */

//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/

class Solution {
    private Node head, pre;

    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void dfs(Node cur) {

        if (cur == null) return;
        dfs(cur.left);
        // 为null 表示第一次进入到二叉树底部
        if (pre == null) {
            head = cur;
        } else {
            // 第二次进入了，
            // head和pre都是左子树，
            // cur是左子树的父亲

            // 先链接父节点
            pre.right = cur;
            // 再回指
            cur.left = pre;
        }
        // 再替换pre
        pre = cur;

        dfs(cur.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
