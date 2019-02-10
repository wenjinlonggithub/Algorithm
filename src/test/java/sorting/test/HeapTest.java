package sorting.test;

import org.junit.Assert;
import sorting.Heap;

public class HeapTest {

    @org.junit.Test
    public void test() {

        Heap<Integer> heap = new Heap<>(10);

        heap.insert(5);
        heap.insert(4);
        heap.insert(6);
        heap.insert(1);

        Assert.assertEquals(heap.size(), 4);

        Assert.assertEquals(6, (int) heap.delMax());
        Assert.assertEquals(5, (int) heap.delMax());
        Assert.assertEquals(4, (int) heap.delMax());
        Assert.assertEquals(1, (int) heap.delMax());

        Assert.assertTrue(heap.isEmpty());
    }
}