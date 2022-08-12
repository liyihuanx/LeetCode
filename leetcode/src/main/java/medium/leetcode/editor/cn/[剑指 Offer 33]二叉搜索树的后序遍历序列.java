/**
 * @author liyihuanx
 * @date 2022-08-09 20:24:41
 * @Description [剑指 Offer 33]二叉搜索树的后序遍历序列
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }
    boolean recur(int[] postorder, int i, int j) {
        if(i >= j) return true;
        int p = i;
        while(postorder[p] < postorder[j]) p++;
        int m = p;
        while(postorder[p] > postorder[j]) p++;
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
