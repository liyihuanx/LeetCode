package com.liyihuanx.leetcode.offer;

import com.liyihuanx.leetcode.TreeNode;

/**
 * @author liyihuan
 * @date 2022/04/21
 * @Description 剑指 Offer 54. 二叉搜索树的第k大节点
 */
class SolutionKthLargest {
	int res, k;

	/**
	 * 二叉搜索树是一棵有序的二叉树，所以我们也可以称它为二叉排序树。
	 * 具有以下性质的二叉树我们称之为二叉搜索树：若它的左子树不为空，那么左子树上的所有值均小于它的根节点；
	 * 若它的右子树不为空，那么右子树上所有值均大于它的根节点。它的左子树和右子树分别也为二叉搜索树。
	 */
	public int kthLargest(TreeNode root, int k) {
		this.k = k;

		// 中序遍历 --> 从小到大排列
		// left,root,right
		dfs(root);
		return res;
	}


	public void dfs(TreeNode root) {
		if (root == null) return;
		dfs(root.right);
		// k == 0 直接退出
		if (k == 0) return;
		// 每次遍历一个节点都做一次记数，
		if (--k == 0) {
			res = root.val;
		}
		dfs(root.left);
	}
}
