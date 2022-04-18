package com.liyihuanx.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liyihuan
 * @date 2022/04/13
 * @Description
 */
class SolutionFirstUniqChar {
	public char firstUniqChar(String s) {
		char result = ' ';
		HashMap<Character, Integer> countMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
		}

		for (int i = 0; i < s.length(); ++i) {
			if (countMap.get(s.charAt(i)) == 1) {
				return s.charAt(i);
			}
		}

		return result;
	}

}
