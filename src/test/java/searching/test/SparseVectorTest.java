package searching.test;

import org.junit.Assert;
import org.junit.Test;
import searching.other.SparseVector;

public class SparseVectorTest {

    @Test
    public void dot() {

        double[] vector1 = {1, 0, 0, 0, 1, 0};
        double[] vector2 = {0, 0, 1, 1, 1, 0};

        SparseVector sparseVector1 = new SparseVector(vector1);
        SparseVector sparseVector2 = new SparseVector(vector2);

        Assert.assertEquals(sparseVector1.dot(sparseVector2), 1, 0.0000001);
    }
}