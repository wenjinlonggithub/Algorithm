package caching.test;

import caching.LRU;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LRUTest {
    @Test
    public void test() {

        LRU<String, String> lru = new LRU<>(3);

        lru.put("K1", "V1");
        lru.put("K2", "V2");
        lru.put("K3", "V3");

        lru.get("K1");
        lru.get("K2");

        lru.put("K4", "V4");

        Iterator iterator = lru.iterator();

        assertEquals(iterator.next(), "K4");
        assertEquals(iterator.next(), "K2");
        assertEquals(iterator.next(), "K1");

        assertFalse(iterator.hasNext());
    }
}