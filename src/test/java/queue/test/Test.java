package queue.test;

import org.junit.Assert;
import queue.ListQueue;
import queue.MyQueue;

public class Test {

    @org.junit.Test
    public void ListStackTest() throws Exception {

        MyQueue<Integer> queue = new ListQueue<>();
        queue.add(1).add(2).add(3).add(4);

        for (Integer item : queue) {
            System.out.println(item);
        }

        Assert.assertEquals(queue.size(), 4);
        Assert.assertFalse(queue.isEmpty());

        Assert.assertEquals(1, (int) queue.remove());
        Assert.assertEquals(2, (int) queue.remove());
        Assert.assertEquals(3, (int) queue.remove());
        Assert.assertEquals(4, (int) queue.remove());

        Assert.assertTrue(queue.isEmpty());
    }
}
