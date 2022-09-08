package leetCode;

/*
    在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，
    但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 */
public class countNumber {
    public static int  duplicate(int[] nums){
//        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            while(nums[i] != i){
                if (nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                swap(nums,i,nums[i]);
            }
        }
        return -1;
    }
    private static void swap(int[] nums,int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t ;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 0, 2, 5,3};
        System.out.println(duplicate(nums));
    }
}
