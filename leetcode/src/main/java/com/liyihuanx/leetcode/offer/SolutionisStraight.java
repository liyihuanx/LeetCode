package com.liyihuanx.leetcode.offer;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author liyihuan
 * @date 2022/06/22
 * @Description 剑指 Offer 61. 扑克牌中的顺子
 */
public class SolutionisStraight {
    public boolean isStraight(int[] nums) {

        Set<Integer> repeat = new HashSet<>();
        int max = 0, min = 14;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);

            if (!repeat.add(nums[i])) {
                return false;
            }
        }

        return max - min < 5;
    }
}
