package searching.other;

import java.util.Date;

/**
 * 交易类，用于演示 hashCode() 实现
 */
public class Transaction {

    private final String who;
    private final Date when;
    private final double amount;


    public Transaction(String who, Date when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }


    public int hashCode() {
        int hash = 17;
        int R = 31;
        hash = R * hash + who.hashCode();
        hash = R * hash + when.hashCode();
        hash = R * hash + ((Double) amount).hashCode();
        return hash;
    }
}
