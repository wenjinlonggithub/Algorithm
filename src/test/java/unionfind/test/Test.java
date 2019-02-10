package unionfind.test;

import org.junit.Assert;
import unionfind.QuickFindUF;
import unionfind.QuickUnionUF;
import unionfind.UF;
import unionfind.WeightedQuickUnionUF;

public class Test {

    private final int N = 10;


    @org.junit.Test
    public void QuickFindUFTest() {
        test(new QuickFindUF(N));
    }


    @org.junit.Test
    public void QuickUnionUFTest() {
        test(new QuickUnionUF(N));
    }


    @org.junit.Test
    public void WeightedQuickUnionUFTest() {
        test(new WeightedQuickUnionUF(N));
    }


    private void test(UF uf) {

        uf.union(0, 1);

        Assert.assertTrue(uf.connected(0, 1));
        Assert.assertFalse(uf.connected(0, 2));

        uf.union(2, 3);
        uf.union(1, 2);

        Assert.assertTrue(uf.connected(0, 3));

    }

}
