package jain.models;

import java.security.CodeSigner;
import java.security.Timestamp;
import java.util.Date;

public class BlockHeader {
    int version = 0;
    long timestamp;
    byte[] prevBlock;           // 32 Byte
    byte[] hashOverAllBlocks;   // 32 Byte
    int nonce;

    public BlockHeader() {
    }

    public BlockHeader(int version, long timestamp, byte[] prevBlock) {
        this.version = version;
        this.timestamp = timestamp;
        this.prevBlock = prevBlock;
    }

    public BlockHeader(int version) {
        this.version = version;
        timestamp = System.currentTimeMillis();
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public byte[] getPrevBlock() {
        return prevBlock;
    }

    public void setPrevBlock(byte[] prevBlock) {
        this.prevBlock = prevBlock;
    }

    public byte[] getHashOverAllBlocks() {
        return hashOverAllBlocks;
    }

    public void setHashOverAllBlocks(byte[] hashOverAllBlocks) {
        this.hashOverAllBlocks = hashOverAllBlocks;
    }

    public void setTransactionListHash(byte[] hashOverAllBlocks) {
        this.hashOverAllBlocks = hashOverAllBlocks;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }
}
