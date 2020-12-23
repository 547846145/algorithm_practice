package heap;

/**
 * @description: 测试堆
 * @author: Will_Lee
 * @create: 2020/12/20 20:03
 **/


public class TestHeap {

    public static void main(String[] args) {
        Heap heap = new Heap(10);
        for (int i = 10; i > 0; i--) {
            heap.insert(i);
        }
        int[] array = heap.getArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < 9; i++) {
            heap.deleteTop();
            int[] arrs = heap.getArray();
            System.out.println("删除第" + (i + 1) + "次元素");
            for (int j = 0; j < arrs.length; j++) {
                System.out.println(arrs[j]);
            }
        }

    }
}
