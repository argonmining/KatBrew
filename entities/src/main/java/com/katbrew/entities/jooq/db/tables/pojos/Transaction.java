/*
 * This file is generated by jOOQ.
 */
package com.katbrew.entities.jooq.db.tables.pojos;


import com.katbrew.entities.jooq.db.tables.interfaces.ITransaction;

import java.math.BigInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Transaction implements ITransaction {

    private static final long serialVersionUID = 1L;

    private BigInteger id;
    private Integer fkToken;
    private String hashRev;
    private String p;
    private String op;
    private BigInteger amt;
    private BigInteger fromAddress;
    private BigInteger toAddress;
    private BigInteger opScore;
    private String feeRev;
    private String txAccept;
    private String opAccept;
    private String opError;
    private String checkpoint;
    private BigInteger mtsAdd;
    private BigInteger mtsMod;

    public Transaction() {}

    public Transaction(ITransaction value) {
        this.id = value.getId();
        this.fkToken = value.getFkToken();
        this.hashRev = value.getHashRev();
        this.p = value.getP();
        this.op = value.getOp();
        this.amt = value.getAmt();
        this.fromAddress = value.getFromAddress();
        this.toAddress = value.getToAddress();
        this.opScore = value.getOpScore();
        this.feeRev = value.getFeeRev();
        this.txAccept = value.getTxAccept();
        this.opAccept = value.getOpAccept();
        this.opError = value.getOpError();
        this.checkpoint = value.getCheckpoint();
        this.mtsAdd = value.getMtsAdd();
        this.mtsMod = value.getMtsMod();
    }

    public Transaction(
        BigInteger id,
        Integer fkToken,
        String hashRev,
        String p,
        String op,
        BigInteger amt,
        BigInteger fromAddress,
        BigInteger toAddress,
        BigInteger opScore,
        String feeRev,
        String txAccept,
        String opAccept,
        String opError,
        String checkpoint,
        BigInteger mtsAdd,
        BigInteger mtsMod
    ) {
        this.id = id;
        this.fkToken = fkToken;
        this.hashRev = hashRev;
        this.p = p;
        this.op = op;
        this.amt = amt;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.opScore = opScore;
        this.feeRev = feeRev;
        this.txAccept = txAccept;
        this.opAccept = opAccept;
        this.opError = opError;
        this.checkpoint = checkpoint;
        this.mtsAdd = mtsAdd;
        this.mtsMod = mtsMod;
    }

    /**
     * Getter for <code>public.Transaction.id</code>.
     */
    @Override
    public BigInteger getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.Transaction.id</code>.
     */
    @Override
    public void setId(BigInteger id) {
        this.id = id;
    }

    /**
     * Getter for <code>public.Transaction.fk_token</code>.
     */
    @Override
    public Integer getFkToken() {
        return this.fkToken;
    }

    /**
     * Setter for <code>public.Transaction.fk_token</code>.
     */
    @Override
    public void setFkToken(Integer fkToken) {
        this.fkToken = fkToken;
    }

    /**
     * Getter for <code>public.Transaction.hash_rev</code>.
     */
    @Override
    public String getHashRev() {
        return this.hashRev;
    }

    /**
     * Setter for <code>public.Transaction.hash_rev</code>.
     */
    @Override
    public void setHashRev(String hashRev) {
        this.hashRev = hashRev;
    }

    /**
     * Getter for <code>public.Transaction.p</code>.
     */
    @Override
    public String getP() {
        return this.p;
    }

    /**
     * Setter for <code>public.Transaction.p</code>.
     */
    @Override
    public void setP(String p) {
        this.p = p;
    }

    /**
     * Getter for <code>public.Transaction.op</code>.
     */
    @Override
    public String getOp() {
        return this.op;
    }

    /**
     * Setter for <code>public.Transaction.op</code>.
     */
    @Override
    public void setOp(String op) {
        this.op = op;
    }

    /**
     * Getter for <code>public.Transaction.amt</code>.
     */
    @Override
    public BigInteger getAmt() {
        return this.amt;
    }

    /**
     * Setter for <code>public.Transaction.amt</code>.
     */
    @Override
    public void setAmt(BigInteger amt) {
        this.amt = amt;
    }

    /**
     * Getter for <code>public.Transaction.from_address</code>.
     */
    @Override
    public BigInteger getFromAddress() {
        return this.fromAddress;
    }

    /**
     * Setter for <code>public.Transaction.from_address</code>.
     */
    @Override
    public void setFromAddress(BigInteger fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * Getter for <code>public.Transaction.to_address</code>.
     */
    @Override
    public BigInteger getToAddress() {
        return this.toAddress;
    }

    /**
     * Setter for <code>public.Transaction.to_address</code>.
     */
    @Override
    public void setToAddress(BigInteger toAddress) {
        this.toAddress = toAddress;
    }

    /**
     * Getter for <code>public.Transaction.op_score</code>.
     */
    @Override
    public BigInteger getOpScore() {
        return this.opScore;
    }

    /**
     * Setter for <code>public.Transaction.op_score</code>.
     */
    @Override
    public void setOpScore(BigInteger opScore) {
        this.opScore = opScore;
    }

    /**
     * Getter for <code>public.Transaction.fee_rev</code>.
     */
    @Override
    public String getFeeRev() {
        return this.feeRev;
    }

    /**
     * Setter for <code>public.Transaction.fee_rev</code>.
     */
    @Override
    public void setFeeRev(String feeRev) {
        this.feeRev = feeRev;
    }

    /**
     * Getter for <code>public.Transaction.tx_accept</code>.
     */
    @Override
    public String getTxAccept() {
        return this.txAccept;
    }

    /**
     * Setter for <code>public.Transaction.tx_accept</code>.
     */
    @Override
    public void setTxAccept(String txAccept) {
        this.txAccept = txAccept;
    }

    /**
     * Getter for <code>public.Transaction.op_accept</code>.
     */
    @Override
    public String getOpAccept() {
        return this.opAccept;
    }

    /**
     * Setter for <code>public.Transaction.op_accept</code>.
     */
    @Override
    public void setOpAccept(String opAccept) {
        this.opAccept = opAccept;
    }

    /**
     * Getter for <code>public.Transaction.op_error</code>.
     */
    @Override
    public String getOpError() {
        return this.opError;
    }

    /**
     * Setter for <code>public.Transaction.op_error</code>.
     */
    @Override
    public void setOpError(String opError) {
        this.opError = opError;
    }

    /**
     * Getter for <code>public.Transaction.checkpoint</code>.
     */
    @Override
    public String getCheckpoint() {
        return this.checkpoint;
    }

    /**
     * Setter for <code>public.Transaction.checkpoint</code>.
     */
    @Override
    public void setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
    }

    /**
     * Getter for <code>public.Transaction.mts_add</code>.
     */
    @Override
    public BigInteger getMtsAdd() {
        return this.mtsAdd;
    }

    /**
     * Setter for <code>public.Transaction.mts_add</code>.
     */
    @Override
    public void setMtsAdd(BigInteger mtsAdd) {
        this.mtsAdd = mtsAdd;
    }

    /**
     * Getter for <code>public.Transaction.mts_mod</code>.
     */
    @Override
    public BigInteger getMtsMod() {
        return this.mtsMod;
    }

    /**
     * Setter for <code>public.Transaction.mts_mod</code>.
     */
    @Override
    public void setMtsMod(BigInteger mtsMod) {
        this.mtsMod = mtsMod;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Transaction other = (Transaction) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.fkToken == null) {
            if (other.fkToken != null)
                return false;
        }
        else if (!this.fkToken.equals(other.fkToken))
            return false;
        if (this.hashRev == null) {
            if (other.hashRev != null)
                return false;
        }
        else if (!this.hashRev.equals(other.hashRev))
            return false;
        if (this.p == null) {
            if (other.p != null)
                return false;
        }
        else if (!this.p.equals(other.p))
            return false;
        if (this.op == null) {
            if (other.op != null)
                return false;
        }
        else if (!this.op.equals(other.op))
            return false;
        if (this.amt == null) {
            if (other.amt != null)
                return false;
        }
        else if (!this.amt.equals(other.amt))
            return false;
        if (this.fromAddress == null) {
            if (other.fromAddress != null)
                return false;
        }
        else if (!this.fromAddress.equals(other.fromAddress))
            return false;
        if (this.toAddress == null) {
            if (other.toAddress != null)
                return false;
        }
        else if (!this.toAddress.equals(other.toAddress))
            return false;
        if (this.opScore == null) {
            if (other.opScore != null)
                return false;
        }
        else if (!this.opScore.equals(other.opScore))
            return false;
        if (this.feeRev == null) {
            if (other.feeRev != null)
                return false;
        }
        else if (!this.feeRev.equals(other.feeRev))
            return false;
        if (this.txAccept == null) {
            if (other.txAccept != null)
                return false;
        }
        else if (!this.txAccept.equals(other.txAccept))
            return false;
        if (this.opAccept == null) {
            if (other.opAccept != null)
                return false;
        }
        else if (!this.opAccept.equals(other.opAccept))
            return false;
        if (this.opError == null) {
            if (other.opError != null)
                return false;
        }
        else if (!this.opError.equals(other.opError))
            return false;
        if (this.checkpoint == null) {
            if (other.checkpoint != null)
                return false;
        }
        else if (!this.checkpoint.equals(other.checkpoint))
            return false;
        if (this.mtsAdd == null) {
            if (other.mtsAdd != null)
                return false;
        }
        else if (!this.mtsAdd.equals(other.mtsAdd))
            return false;
        if (this.mtsMod == null) {
            if (other.mtsMod != null)
                return false;
        }
        else if (!this.mtsMod.equals(other.mtsMod))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.fkToken == null) ? 0 : this.fkToken.hashCode());
        result = prime * result + ((this.hashRev == null) ? 0 : this.hashRev.hashCode());
        result = prime * result + ((this.p == null) ? 0 : this.p.hashCode());
        result = prime * result + ((this.op == null) ? 0 : this.op.hashCode());
        result = prime * result + ((this.amt == null) ? 0 : this.amt.hashCode());
        result = prime * result + ((this.fromAddress == null) ? 0 : this.fromAddress.hashCode());
        result = prime * result + ((this.toAddress == null) ? 0 : this.toAddress.hashCode());
        result = prime * result + ((this.opScore == null) ? 0 : this.opScore.hashCode());
        result = prime * result + ((this.feeRev == null) ? 0 : this.feeRev.hashCode());
        result = prime * result + ((this.txAccept == null) ? 0 : this.txAccept.hashCode());
        result = prime * result + ((this.opAccept == null) ? 0 : this.opAccept.hashCode());
        result = prime * result + ((this.opError == null) ? 0 : this.opError.hashCode());
        result = prime * result + ((this.checkpoint == null) ? 0 : this.checkpoint.hashCode());
        result = prime * result + ((this.mtsAdd == null) ? 0 : this.mtsAdd.hashCode());
        result = prime * result + ((this.mtsMod == null) ? 0 : this.mtsMod.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Transaction (");

        sb.append(id);
        sb.append(", ").append(fkToken);
        sb.append(", ").append(hashRev);
        sb.append(", ").append(p);
        sb.append(", ").append(op);
        sb.append(", ").append(amt);
        sb.append(", ").append(fromAddress);
        sb.append(", ").append(toAddress);
        sb.append(", ").append(opScore);
        sb.append(", ").append(feeRev);
        sb.append(", ").append(txAccept);
        sb.append(", ").append(opAccept);
        sb.append(", ").append(opError);
        sb.append(", ").append(checkpoint);
        sb.append(", ").append(mtsAdd);
        sb.append(", ").append(mtsMod);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ITransaction from) {
        setId(from.getId());
        setFkToken(from.getFkToken());
        setHashRev(from.getHashRev());
        setP(from.getP());
        setOp(from.getOp());
        setAmt(from.getAmt());
        setFromAddress(from.getFromAddress());
        setToAddress(from.getToAddress());
        setOpScore(from.getOpScore());
        setFeeRev(from.getFeeRev());
        setTxAccept(from.getTxAccept());
        setOpAccept(from.getOpAccept());
        setOpError(from.getOpError());
        setCheckpoint(from.getCheckpoint());
        setMtsAdd(from.getMtsAdd());
        setMtsMod(from.getMtsMod());
    }

    @Override
    public <E extends ITransaction> E into(E into) {
        into.from(this);
        return into;
    }
}
