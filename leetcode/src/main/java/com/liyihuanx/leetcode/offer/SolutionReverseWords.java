package com.liyihuanx.leetcode.offer;

/**
 * @author liyihuan
 * @date 2022/04/18
 * @Description 剑指 Offer 58 - I. 翻转单词顺序
 */
class SolutionReverseWords {
	public String reverseWords(String s) {
		String[] str = s.trim().split(" ");

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = str.length - 1; i >= 0; i--) {
			if(str[i].equals("")) continue; // 遇到空单词则跳过
			stringBuilder.append(str[i] + " ");
		}
		return stringBuilder.toString().trim();
	}
}
