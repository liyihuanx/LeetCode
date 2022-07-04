package com.liyihuanx.leetcode.offer;

import java.util.ArrayList;

/**
 * @author liyihuan
 * @date 2022/6/22
 * @description 剑指 Offer 62. 圆圈中最后剩下的数字
 */
public class SolutionlastRemaining {

    public int lastRemaining(int n, int m) {
        int pos = 0; // 最终活下来那个人的初始位置
        for(int i = 2; i <= n; i++){
            pos = (pos + m) % i;  // 每次循环右移
        }
        return pos;
    }

}
