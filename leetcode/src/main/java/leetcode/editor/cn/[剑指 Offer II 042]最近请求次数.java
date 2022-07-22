import java.util.ArrayList;

/**
 * @author liyihuanx
 * @date 2022-07-07 18:51:47
 * @Description [剑指 Offer II 042]最近请求次数
 */

//leetcode submit region begin(Prohibit modification and deletion)
class RecentCounter {

    ArrayList<Integer> nums;
    int count;

    public RecentCounter() {
        count = 0;
        nums = new ArrayList<>();
    }
    
    public int ping(int t) {
        nums.add(t);

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) + 3000 >= t) {
                count = nums.size() - i;
                break;
            }
        }

        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
//leetcode submit region end(Prohibit modification and deletion)
