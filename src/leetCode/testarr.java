package leetCode;

import java.util.HashMap;
import java.util.Set;
/*统计数组中重复书籍出现的次数*/
public class testarr {
    public static void main(String[] args) {
        int[] nums = new int[]{7,1,6,4,2,2,5,3,4,3,4,5,1,6,7};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                count = count + 1;
                map.put(nums[i],count);
            }else {
                map.put(nums[i],1);
            }
        }
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            if (map.get(key) > 2)
                System.out.println(key);
        }
    }
}
