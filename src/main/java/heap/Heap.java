package heap;

/**
 * @description: 堆
 * @author: Will_Lee
 * @create: 2020/12/20 19:56
 **/

/**
 * 堆满足完全二叉树(除了最后一层所有节点都是满的,最后一层所有节点靠左排列）
 * 堆中每个节点的值都必须大于等于（或者小于等于）其子树的每一个节点,是大顶堆（小顶堆）
 *
 */


public class Heap {
    private int[] array;
    private int n;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    private int count;

    public Heap(int capacity) {
        array = new int[capacity + 1];
        n = capacity;
        count = 0;
    }

    public void insert(int data) {
        if (count >= n) {
            return;
        }
        ++count;
        array[count] = data;
        int i = count;
        while(i/2 >0 && array[i/2] > array[i]) {
            int temp = array[i];
            array[i] = array[i/2];
            array[i/2] = temp;
            i = i/2;
        }
    }

    public void deleteTop() {
        if (count <= 0) {
            return;
        }
        int i = 1;
        int maxPos = i;
        array[i] = array[count];
        array[count] = 0;
        --count;
        while(true) {
            if (i*2 <= count && array[i] > array[2*i]) {
                maxPos = 2*i;
            }
            if (i*2 +1 <= count && array[maxPos] > array[2*i+1]) {
                maxPos = 2*i +1;
            }
            if (i  == maxPos) {
                break;
            }
            int temp = array[i];
            array[i] = array[maxPos];
            array[maxPos] = temp;
            i = maxPos;
        }

    }

}
