import java.util.HashMap;

/**
 * @author liyihuanx
 * @date 2022-07-12 20:37:54
 * @Description [剑指 Offer II 075]数组相对排序
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = 0;
        for (int i : arr1) {
            max = Math.max(max,i);
        }

        int[] hash = new int[max + 1];

        for (int i: arr1) {
            hash[i]++;
        }

        int idx = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (hash[arr2[i]]-- > 0) {
                arr1[idx ++] = arr2[i];
            }
        }

        for(int i = 0; i < hash.length; i ++) {
            while(hash[i] -- > 0) {
                arr1[idx ++] = i;
            }
        }
        return arr1;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
