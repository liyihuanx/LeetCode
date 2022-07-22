import java.util.HashMap;

/**
 * @author liyihuanx
 * @date 2022-07-22 17:13:31
 * @Description [剑指 Offer 50]第一个只出现一次的字符
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
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
//leetcode submit region end(Prohibit modification and deletion)
