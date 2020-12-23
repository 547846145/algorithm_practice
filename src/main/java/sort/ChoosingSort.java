package sort; /**
 * @description: 选择排序
 * @author: Will_Lee
 * @create: 2020/12/20 14:28
 **/

/**
 * 个人理解：
 * 1.选择排序思路总结按第一个循环的下标去处理，每次从所有剩余未排序数组中选择一个进行排序，依次累加，重复。
 * 官方解读：
 * 用选择排序算法将数组中的元素，分成已排序区与待排序区。
 * 然后，每一轮从待排序区中选择一个最小值元素，放到已排序区的末尾，也就是待排序区的头部。
 */
public class ChoosingSort {


    public static void main(String[] args) {
        int[] a = {22,200,88,45,76,67,51};
        chooseSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void chooseSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int k = i;
            for (int j = i+1; j< array.length ; j++) {
                if (temp > array[j]) {
                    temp = array[j];
                    k = j;
                }
            }
            array[k] = array[i];
            array[i] = temp;
        }
    }
}
