package com.liyihuanx.leetcode.offer;

import com.liyihuanx.leetcode.TreeNode;

/**
 * @author liyihuan
 * @date 2022/03/28
 * @Description 剑指 Offer 27. 二叉树的镜像
 */
class SolutionMirrorTree {
	public TreeNode mirrorTree(TreeNode root) {
		if (root == null) return null;

		TreeNode temp = root.left;
		root.left = mirrorTree(root.right);
		root.right = mirrorTree(temp);

		return root;
	}
}
