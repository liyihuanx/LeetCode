/**
 * @author liyihuanx
 * @date 2022-07-06 19:12:12
 * @Description [剑指 Offer 58 - II]左旋转字符串
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder res = new StringBuilder();
        for(int i = n; i < n + s.length(); i++)
            res.append(s.charAt(i % s.length()));
        return res.toString();

    }
}
//leetcode submit region end(Prohibit modification and deletion)
