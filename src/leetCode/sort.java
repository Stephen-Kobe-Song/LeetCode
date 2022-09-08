package leetCode;

/**
 * @BelongsProject: LeetCode
 * @BelongsPackage: leetCode
 * @Author: song
 * @CreateTime: 2022-08-10  20:36
 * @Description: 十大经典排序算法
 * @Version: 1.0
 */

public class sort {
    public static void main(String[] args) {
        int[] arr = {3,5,15,26,27,2,4,19,36,38,44,50,46,6,9,48};
        bubbleSort(arr);
        System.out.println("冒泡排序：");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr1 = {3,5,15,26,27,2,4,19,36,38,44,50,46,6,9,48};
        selectionSort(arr1);
        System.out.println("选择排序");
        for (int num : arr1){
            System.out.print(num + " ");
        }
    }
    /**
     * @description: 冒泡排序是一种简单的排序算法。它重复地遍历要排序的序列，依次比较两个元素，
     * 如果它们的顺序错误就把它们交换过来。遍历序列的工作是重复地进行直到没有再需要交换为止，
     * 此时说明该序列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢 “浮” 到数列的顶端。
     *
     * 算法分析
     * 稳定性：稳定
     * 时间复杂度 ：最佳：O(n) ，最差：O(n2)， 平均：O(n2)
     * 空间复杂度 ：O(1)
     * 排序方式 ：In-place
     *
     * @author: song
     * @date: 2022/8/10 20:54
     * @param: [arr]
     * @return: int[]
     **/
    public static int[] bubbleSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length -i; j++) {
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    /**
     * @description: 选择排序是一种简单直观的排序算法，无论什么数据进去都是 O(n²) 的时间复杂度。
     * 所以用到它的时候，数据规模越小越好。唯一的好处可能就是不占用额外的内存空间了吧。
     * 它的工作原理：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
     * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
     * 以此类推，直到所有元素均排序完毕。
     *
     * 算法分析
     * 稳定性：不稳定
     * 时间复杂度 ：最佳：O(n2) ，最差：O(n2)， 平均：O(n2)
     * 空间复杂度 ：O(1)
     * 排序方式 ：In-place
     * @author: song
     * @date: 2022/8/10 21:03
     * @param: [arr]
     * @return: int[]
     **/
    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
        return arr;
    }

    /**
     * @description:插入排序 (Insertion Sort)
     * 插入排序是一种简单直观的排序算法。它的工作原理是通过构建有序序列，对于未排序数据，
     * 在已排序序列中从后向前扫描，找到相应位置并插入。
     * 插入排序在实现上，通常采用 in-place 排序（即只需用到 O(1) 的额外空间的排序），
     * 因而在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
     *
     * 算法分析
     * 稳定性：稳定
     * 时间复杂度 ：最佳：O(n) ，最差：O(n2)， 平均：O(n2)
     * 空间复杂度 ：O(1)
     * 排序方式 ：In-place
     * @author: song 
     * @date: 2022/8/10 21:21
     * @param: [arr]
     * @return: int[]
     **/
    public static int[] insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int preIndex = i - 1;
            int current = arr[i];
            while (preIndex >=0 && current < arr[preIndex]){
                arr[preIndex + 1] = arr[preIndex];
                preIndex -= 1;
            }
            arr[preIndex + 1] = current;
        }

        return arr;
    }

    /**
     * @description: 希尔排序 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，
     * 具体算法描述：
     * 选择一个增量序列 {t1, t2, …, tk}，其中 (ti>tj, i<j, tk=1)；
     * 按增量序列个数 k，对序列进行 k 趟排序；
     * 每趟排序，根据对应的增量 t，将待排序列分割成若干长度为 m 的子序列，分别对各子表进行直接插入排序。
     * 仅增量因子为 1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
     * 算法分析
     * 稳定性：稳定
     * 时间复杂度 ：最佳：O(nlogn)， 最差：O(n2) 平均：O(nlogn)
     * 空间复杂度 ：O(n)
     * @author: song
     * @date: 2022/8/10 21:44
     * @param: [arr]
     * @return: int[]
     **/
    public static int[] shellSort(int[] arr){
        int n = arr.length;
        int gap = n / 2;
        while (gap > 0){
            for (int i = gap; i < n;i++){
                int current = arr[i];
                int preIndex = i -gap;
                while(preIndex >= 0 && arr[preIndex] > current){
                    arr[preIndex +gap] = arr[preIndex];
                    preIndex -= gap;
                }
                arr[preIndex +gap] =current;
            }
            gap /= 2;
        }
        return arr;
    }


}





