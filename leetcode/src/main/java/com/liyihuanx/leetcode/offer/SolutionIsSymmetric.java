package com.liyihuanx.leetcode.offer;

import com.liyihuanx.leetcode.TreeNode;

/**
 * @author liyihuan
 * @date 2022/03/28
 * @Description 剑指 Offer 28. 对称的二叉树
 */
class SolutionIsSymmetric {
	public boolean isSymmetric(TreeNode root) {

		return root == null ? true : recur(root.left, root.right);
	}


	boolean recur(TreeNode L, TreeNode R) {
		if(L == null && R == null) return true;
		if(L == null || R == null || L.val != R.val) return false;
		return recur(L.left, R.right) && recur(L.right, R.left);
	}

}
