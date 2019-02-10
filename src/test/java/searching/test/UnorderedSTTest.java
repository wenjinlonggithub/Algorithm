package searching.test;

import org.junit.Assert;
import searching.unordered.LinearProbingHashST;
import searching.unordered.ListUnorderedST;
import searching.unordered.UnorderedST;

public class UnorderedSTTest {

    @org.junit.Test
    public void ListUnorderedSTTest() {
        test(new ListUnorderedST<String, Integer>());
    }


    @org.junit.Test
    public void LinearProbingHashSTTest() {
        test(new LinearProbingHashST<String, Integer>());
    }


    private void test(UnorderedST<String, Integer> st) {

        String key1 = "a", key2 = "b";
        int value1 = 1, value2 = 2;

        st.put(key1, value1);

        Assert.assertEquals((int) st.get(key1), value1);
        Assert.assertNull(st.get(key2));

        st.put(key2, value2);

        Assert.assertEquals((int) st.get(key2), value2);
        Assert.assertEquals(2, st.size());

        st.put(key2, value1);

        Assert.assertEquals((int) st.get(key2), value1);

        st.delete(key2);

        Assert.assertNull(st.get(key2));
    }
}
