package sort; /**
 * @description: 插入排序
 * @author: Will_Lee
 * @create: 2020/12/20 15:07
 **/

/**
 * 1.考虑边界条件  即数组长度为1的情况
 * 2.-1插入排序核心原理, 左边为已排序取键，
 *   -2选择右边选择未排序区间第一个元素和左边排序取键进行排序，
 *   -3每次遇到一个比当前元素（未排序区间第一个元素）大的元素,大的元素右移一位,为当前元素腾出位置。
 */

/**
 * 分析  1.与选择排序区别,选择排序从第一个元素开始,插入排序,
 *      2.默认第一个元素就是有序的,右边的元素为无序.
 *
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {22,200,88,45,76,67,51};
        insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static void insertionSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >=0 ; j--) {
                if (array[j] > value) {
                    array[j +1] = array[j];
                } else {
                    break;
                }
            }
            array[j+1] = value;
        }
    }
}
