package threesum.test;

import org.junit.Assert;
import threesum.ThreeSum;
import threesum.ThreeSumBinarySearch;
import threesum.ThreeSumSlow;
import threesum.ThreeSumTwoPointer;

public class Test {

    private final int[] nums = {-2, -1, 0, 1, 2};
    private final int expect = 2;


    @org.junit.Test
    public void ThreeSumTest() {
        test(new ThreeSumSlow());
    }


    @org.junit.Test
    public void ThreeSumBinarySearchTest() {
        test(new ThreeSumBinarySearch());
    }

    @org.junit.Test
    public void TreeSumTwoPointerTest() {
        test(new ThreeSumTwoPointer());
    }


    private void test(ThreeSum threeSum) {
        Assert.assertEquals(threeSum.count(nums), expect);
    }

}