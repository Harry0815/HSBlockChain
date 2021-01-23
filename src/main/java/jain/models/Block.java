package jain.models;

import jain.helpers.SHA3Helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Block {
    private int magicNumber = 0;
    private int blockSize = 0;
    private List<Transaction> transaction;
    private int transactionCount;

    BlockHeader header;

    public Block() {
        this.blockSize = 92;
        this.transaction = new ArrayList<Transaction>();
        this.transactionCount = transaction.size();

        // header = new BlockHeader(1, System.currentTimeMillis(), prev);
        header = null;
    }

    public Block(byte [] prev) {
        this.blockSize = 92;
        this.transaction = new ArrayList<Transaction>();
        this.transactionCount = transaction.size();

        header = new BlockHeader(1, System.currentTimeMillis(), prev);
    }

    public void addTransaction (Transaction transaction) throws Exception {
        this.transaction.add(transaction);
        this.transactionCount++;
        this.header.setTransactionListHash(SHA3Helper.hash256(this.transaction));
        this.blockSize += 128;
    }
}
