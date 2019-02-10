package searching.other;

import java.util.HashMap;

/**
 * 稀疏矩阵
 */
public class SparseVector {

    private HashMap<Integer, Double> hashMap;

    public SparseVector(double[] vector) {

        hashMap = new HashMap<>();

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != 0) {
                hashMap.put(i, vector[i]);
            }
        }
    }


    public double get(int i) {
        return hashMap.getOrDefault(i, 0.0);
    }


    public double dot(SparseVector other) {

        double sum = 0;
        for (int i : hashMap.keySet()) {
            sum = sum + this.get(i) * other.get(i);
        }
        return sum;
    }
}