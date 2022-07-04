/**
 * @author liyihuanx
 * @date 2022-06-29 18:07:42
 * @Description [剑指 Offer II 019]最多删除一个字符得到回文
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while (low < high) {
            char c1 = s.charAt(low), c2 = s.charAt(high);
            if (c1 == c2) {
                ++low;
                --high;
            } else {
                return validPalindrome(s, low, high - 1) || validPalindrome(s, low + 1, high);
            }
        }
        return true;

    }

    public boolean validPalindrome(String s, int start, int end) {
        for (int i = start, j = end; i < j; ++i, --j) {
            char c1 = s.charAt(i), c2 = s.charAt(j);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
