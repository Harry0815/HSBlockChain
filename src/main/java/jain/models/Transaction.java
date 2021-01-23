package jain.models;

import jain.helpers.SHA3Helper;

import java.io.Serializable;
import java.util.Date;

/**
 * Verschicke irgendwas von A nach B
 */
public class Transaction implements Serializable {
    byte[] txId;
    transient byte[] blockid;

    byte[] sender;
    byte[] receiver;
    Double amount;
    Integer nonce;
    Double transactionFeeBasePrice;
    Double transactionFeeLimit;

    public Transaction() {
    }

    public Transaction(byte[] sender, byte[] receiver, Double amount, Integer nonce, Double transactionFeeBasePrice, Double transactionFeeLimit) throws Exception {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.nonce = nonce;
        this.transactionFeeBasePrice = transactionFeeBasePrice;
        this.transactionFeeLimit = transactionFeeLimit;
        this.blockid = SHA3Helper.hash256(new Date());
        this.txId = SHA3Helper.hash256(this);
    }

    public byte[] getTxId() {
        return txId;
    }

    public void setTxId(byte[] txId) {
        this.txId = txId;
    }

    public byte[] getBlockid() {
        return blockid;
    }

    public void setBlockid(byte[] blockid) {
        this.blockid = blockid;
    }

    public byte[] getSender() {
        return sender;
    }

    public void setSender(byte[] sender) {
        this.sender = sender;
    }

    public byte[] getReceiver() {
        return receiver;
    }

    public void setReceiver(byte[] receiver) {
        this.receiver = receiver;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getNonce() {
        return nonce;
    }

    public void setNonce(Integer nonce) {
        this.nonce = nonce;
    }

    public Double getTransactionFeeBasePrice() {
        return transactionFeeBasePrice;
    }

    public void setTransactionFeeBasePrice(Double transactionFeeBasePrice) {
        this.transactionFeeBasePrice = transactionFeeBasePrice;
    }

    public Double getTransactionFeeLimit() {
        return transactionFeeLimit;
    }

    public void setTransactionFeeLimit(Double transactionFeeLimit) {
        this.transactionFeeLimit = transactionFeeLimit;
    }
}
