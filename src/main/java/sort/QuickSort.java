package sort; /**
 * @description: 快速排序算法
 * @author: Will_Lee
 * @create: 2020/12/20 14:23
 **/

/**
 * 1.快排利用分治和分区的思想，核心是分区，先选择一个中心点pivot,
 * 2.找到比pivot小的都放左边,比pivot大的都放右边,得到pivot的位置为q,第一次分区完成
 * 3.分区后将分得的两个数组继续分区.
 */

/**
 * 分析： 1.与插入排序的差别,插入排序是有序区间与无序区间的第一个元素进行比较.
 *       2.与选择排序区别,选择排序是在无序区间选择元素排在有序区间之后.必须从第一个元素开始
 */

/**
 * 1.快速排序选择pivot进行分区都可以得到该pivot的位置,
 * 2.让K和该pivot比较,进行下一次分区的选择,
 * 3.如果pivot选择得不错,最终效率可以和2分法媲美.
 */

/**
 * 快排优化：
 * 1. 单边递归优化,
 * 2. 基准值选取优化(三点取中法） c++ STL的选取规则
 * 3. partition操作优化
 */

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {22,200,88,45,76,67,51};
        quickSortLeftImprove(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void quickSort(int[] array,int start,int end) {
        if(start >= end) {
            return;
        }
        int q = partition(array,start,end);
        quickSort(array,start,q-1);
        quickSort(array,q+1,end);
    }

    /**
     * 单边递归优化：
     * 从程序运行角度来说,每次函数调用都会消耗一部分运行时间,我们只要减少函数调用,就可以加快程序运行速度。
     * 当本层完成了partition操作后,让本层继续左边的partition操作,而基准值右边的排序交给下一层递归函数去处理.
     */
    public static void quickSortLeftImprove(int[] array,int start,int end) {
        if (start >= end) {
            return;
        }
        while(start < end) {
            int q = partition(array,start,end);
            quickSortLeftImprove(array,q+1,end);
            end =q - 1;
        }
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start;
        for (int j = start; j <end; j++) {
            if (array[j] < pivot) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i += 1;
            }
        }
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }

}
