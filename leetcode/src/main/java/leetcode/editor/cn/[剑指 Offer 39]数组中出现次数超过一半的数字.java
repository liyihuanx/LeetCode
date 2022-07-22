import java.util.List;

/**
 * @author liyihuanx
 * @date 2022-07-21 18:19:33
 * @Description [剑指 Offer 39]数组中出现次数超过一半的数字
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    public int majorityElement(int[] nums) {
        for (int num : nums) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            } else {
                hashMap.put(num, hashMap.get(num) + 1);
            }
        }

        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
