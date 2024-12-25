/*
 * This file is generated by jOOQ.
 */
package com.nacho.entities.jooq.db.tables.pojos;


import com.nacho.entities.jooq.db.tables.interfaces.IBalance;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Balance implements IBalance {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer holderId;
    private Long balance;
    private String tick;

    public Balance() {}

    public Balance(IBalance value) {
        this.id = value.getId();
        this.holderId = value.getHolderId();
        this.balance = value.getBalance();
        this.tick = value.getTick();
    }

    public Balance(
        Integer id,
        Integer holderId,
        Long balance,
        String tick
    ) {
        this.id = id;
        this.holderId = holderId;
        this.balance = balance;
        this.tick = tick;
    }

    /**
     * Getter for <code>public.Balance.id</code>.
     */
    @Override
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.Balance.id</code>.
     */
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>public.Balance.holder_id</code>.
     */
    @Override
    public Integer getHolderId() {
        return this.holderId;
    }

    /**
     * Setter for <code>public.Balance.holder_id</code>.
     */
    @Override
    public void setHolderId(Integer holderId) {
        this.holderId = holderId;
    }

    /**
     * Getter for <code>public.Balance.balance</code>.
     */
    @Override
    public Long getBalance() {
        return this.balance;
    }

    /**
     * Setter for <code>public.Balance.balance</code>.
     */
    @Override
    public void setBalance(Long balance) {
        this.balance = balance;
    }

    /**
     * Getter for <code>public.Balance.tick</code>.
     */
    @Override
    public String getTick() {
        return this.tick;
    }

    /**
     * Setter for <code>public.Balance.tick</code>.
     */
    @Override
    public void setTick(String tick) {
        this.tick = tick;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Balance other = (Balance) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.holderId == null) {
            if (other.holderId != null)
                return false;
        }
        else if (!this.holderId.equals(other.holderId))
            return false;
        if (this.balance == null) {
            if (other.balance != null)
                return false;
        }
        else if (!this.balance.equals(other.balance))
            return false;
        if (this.tick == null) {
            if (other.tick != null)
                return false;
        }
        else if (!this.tick.equals(other.tick))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.holderId == null) ? 0 : this.holderId.hashCode());
        result = prime * result + ((this.balance == null) ? 0 : this.balance.hashCode());
        result = prime * result + ((this.tick == null) ? 0 : this.tick.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Balance (");

        sb.append(id);
        sb.append(", ").append(holderId);
        sb.append(", ").append(balance);
        sb.append(", ").append(tick);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IBalance from) {
        setId(from.getId());
        setHolderId(from.getHolderId());
        setBalance(from.getBalance());
        setTick(from.getTick());
    }

    @Override
    public <E extends IBalance> E into(E into) {
        into.from(this);
        return into;
    }
}
