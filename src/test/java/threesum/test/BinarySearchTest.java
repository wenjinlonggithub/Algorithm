package threesum.test;

import org.junit.Assert;
import threesum.BinarySearch;

public class BinarySearchTest {

    private int[][] nums = {
            {1, 3, 5}, {1, 3, 5}, {1, 3, 5}
    };

    private int[] targets = {
            0, 3, 4
    };

    private int[] expects = {
            -1, 1, -1
    };

    @org.junit.Test
    public void search() {
        for (int i = 0; i < nums.length; i++) {
            Assert.assertEquals(BinarySearch.search(nums[i], targets[i]), expects[i]);
        }
    }
}