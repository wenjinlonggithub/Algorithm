package stack.test;

import org.junit.Assert;
import stack.ArrayStack;
import stack.ListStack;
import stack.MyStack;

import static org.junit.Assert.assertTrue;

public class Test {

    @org.junit.Test
    public void ResizingArrayStackTest() throws Exception {
        test(new ArrayStack<>());
    }


    @org.junit.Test
    public void ListStackTest() throws Exception {
        test(new ListStack<>());
    }


    private static void test(MyStack<Integer> stack) throws Exception {

        stack.push(1).push(2).push(3).push(4);

        Assert.assertEquals(stack.size(), 4);
        Assert.assertFalse(stack.isEmpty());

        for (Integer item : stack) {
            System.out.println(item);
        }

        Assert.assertEquals(4, (int) stack.pop());
        Assert.assertEquals(3, (int) stack.pop());
        Assert.assertEquals(2, (int) stack.pop());
        Assert.assertEquals(1, (int) stack.pop());

        assertTrue(stack.isEmpty());

    }
}
