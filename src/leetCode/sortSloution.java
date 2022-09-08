package leetCode;

import java.util.Arrays;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: LeetCode
 * @Author: song
 * @CreateTime: 2022-05-18  17:10
 * @Description: 数据结构中经典算法的实现！
 * @Version: 1.0
 */

public class sortSloution {
    /**
     * @description:冒泡排序算法！
     * @author: song
     * @date: 2022/5/18 17:25
     * @param: [nums]
     * @return: int[]
     **/
    public static int[] bubbleSort(int[] nums){
        int length = nums.length;
        for (int i = 0; i < length -1; i++) {
            for (int j = 0; j < length -1 -i; j++) {
                if (nums[j] > nums[j+1]){
                    int temp =nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] =temp;
                }
            }
        }
        return nums;
    }
    /**
     * @description:插入排序算法！
     * @author: song
     * @date: 2022/5/18 17:38
     * @param: [nums]
     * @return: int[]
     **/
    public static int[] insertSort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j = i- 1;
            while(j >= 0){
                if (temp < nums[j]){
                    nums[j+1] = nums[j];
                }else {
                    break;
                }
                j--;
            }
            nums[j+1] =temp;
        }

        return nums;
    }
    
    /**
     * @description:选择排序算法！
     * @author: song
     * @date: 2022/5/18 20:15
     * @param: [nums]
     * @return: int[]
     **/
    public static int[] selectSort(int[] nums){
        int minNum = 0;
        int minIndex = 0;
        for (int i = 0; i < nums.length -1; i++) {
            minNum = nums[i];
            minIndex = i;
            for (int j = i+1; j < nums.length ; j++) {
                if (minNum > nums[j]){
                    minNum = nums[j];
                    minIndex = j ;
                }
            }
            nums[minIndex] = nums[i];
            nums[i] = minNum;
        }
        return nums;
    }
    /**
     * @description:快速排序实现！
     * @author: song
     * @date: 2022/5/18 20:58
     * @param: [nums]
     * @return: int[]
     **/
    public  static int[] quickSort(int[] nums, int leftIndex,int rightIndex){
        if (leftIndex>=rightIndex){
            return null;
        }
        int left = leftIndex;
        int right = rightIndex;
        // 待排序的第一个元素作为基准值
        int key = nums[left];
        while(left <right){
            while(right >left && nums[right] >= key){
                right--;
            }
            // 找到这个数赋值给nums[left]
            nums[left] = nums[right];
            while (right > left && nums[left] <= key){
                left++;
            }
            nums[right] = nums[left];
        }
        // 基准值归位！
        nums[left] =key;
        quickSort(nums,leftIndex,left-1);
        quickSort(nums,right+1,rightIndex);
        return nums;
    }
    /**
     * @description:希尔排序实现！
     * @author: song
     * @date: 2022/5/18 22:46
     * @param: [nums]
     * @return: int[]
     **/
    public static int[] shellSort(int[] nums){
        int gap = nums.length;
        do {
            gap = gap /3 +1;
            for (int i = gap; i < nums.length; i++) {
                if (nums[i] <nums[i-gap]){
                    int tmp = nums[i];
                    int k = i - gap;
                    for (; k>=0 && nums[k] > tmp;k -= gap){
                        nums[k + gap] = nums[k];
                    }
                    nums[k + gap] =tmp;
                }
            }
        }while (gap>1);
        return nums;
    }
    /**
     * @description:
     * @author: song
     * @date: 2022/5/19 15:45
     * @param: [nums]
     * @return: void
     **/
    public static void heapSort(int[] nums){
        int temp = 0;
        for (int i = 0; i < nums.length/2 -1; i++) {
            adjustHeap(nums,i, nums.length);
        }
        for (int k = nums.length-1;k>0;k--){
            temp = nums[k];
            nums[k] = nums[0];
            nums[0] = temp;
            adjustHeap(nums,0,k);
        }
    }
    public static void adjustHeap(int[] nums,int i ,int length){
        int temp = nums[i];
        for (int j = i *2 + 1; j < length; j = j *2 +1) {
            if(j+1 < length && nums[j] < nums[j+1]){
                j++;
            }
            if (nums[j] > nums[i]){
                nums[i] = nums[j];
                i = j;
            }else
                break;
        }
        nums[i] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,6,4,1,3};
        //冒泡算法实现测试！
        int[] bubblesortNums = bubbleSort(nums);
        for (int i = 0; i < bubblesortNums.length; i++) {
            System.out.print(bubblesortNums[i] +",");
        }
        System.out.println();
        // 插入排序算法实现测试
        nums = new int[]{2,6,4,1,3};
        int[] insertSortNums = insertSort(nums);
        for (int i = 0; i < insertSortNums.length; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println();
        // 选择排序算法实现测试
        nums = new int[]{2,6,4,1,3,2};
        int[] selectSort = selectSort(nums);
        System.out.println(Arrays.toString(selectSort));
        // 快速排序算法实现测试
        nums = new int[]{2,6,4,1,3,2};
        int[] quickSort = quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(quickSort));
        // 希尔排序算法实现测试
        nums = new int[]{2,6,4,1,3,2};
        System.out.println(Arrays.toString(shellSort(nums)));
        nums = new int[]{2,6,4,1,3,2};
        // 堆排序算法实现测试
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
