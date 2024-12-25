/*
 * This file is generated by jOOQ.
 */
package com.nacho.entities.jooq.db.tables.records;


import com.nacho.entities.jooq.db.tables.Token;
import com.nacho.entities.jooq.db.tables.interfaces.IToken;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TokenRecord extends UpdatableRecordImpl<TokenRecord> implements IToken {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.Token.id</code>.
     */
    @Override
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.Token.id</code>.
     */
    @Override
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.Token.tick</code>.
     */
    @Override
    public void setTick(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.Token.tick</code>.
     */
    @Override
    public String getTick() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.Token.max</code>.
     */
    @Override
    public void setMax(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.Token.max</code>.
     */
    @Override
    public Long getMax() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.Token.lim</code>.
     */
    @Override
    public void setLim(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.Token.lim</code>.
     */
    @Override
    public Long getLim() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.Token.pre</code>.
     */
    @Override
    public void setPre(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.Token.pre</code>.
     */
    @Override
    public Long getPre() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.Token.mts_add</code>.
     */
    @Override
    public void setMtsAdd(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.Token.mts_add</code>.
     */
    @Override
    public Long getMtsAdd() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.Token.holder_total</code>.
     */
    @Override
    public void setHolderTotal(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.Token.holder_total</code>.
     */
    @Override
    public Integer getHolderTotal() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.Token.dec</code>.
     */
    @Override
    public void setDec(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.Token.dec</code>.
     */
    @Override
    public Integer getDec() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.Token.minted</code>.
     */
    @Override
    public void setMinted(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.Token.minted</code>.
     */
    @Override
    public Long getMinted() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>public.Token.state</code>.
     */
    @Override
    public void setState(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.Token.state</code>.
     */
    @Override
    public String getState() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.Token.logo</code>.
     */
    @Override
    public void setLogo(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.Token.logo</code>.
     */
    @Override
    public String getLogo() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IToken from) {
        setId(from.getId());
        setTick(from.getTick());
        setMax(from.getMax());
        setLim(from.getLim());
        setPre(from.getPre());
        setMtsAdd(from.getMtsAdd());
        setHolderTotal(from.getHolderTotal());
        setDec(from.getDec());
        setMinted(from.getMinted());
        setState(from.getState());
        setLogo(from.getLogo());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IToken> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TokenRecord
     */
    public TokenRecord() {
        super(Token.TOKEN);
    }

    /**
     * Create a detached, initialised TokenRecord
     */
    public TokenRecord(Integer id, String tick, Long max, Long lim, Long pre, Long mtsAdd, Integer holderTotal, Integer dec, Long minted, String state, String logo) {
        super(Token.TOKEN);

        setId(id);
        setTick(tick);
        setMax(max);
        setLim(lim);
        setPre(pre);
        setMtsAdd(mtsAdd);
        setHolderTotal(holderTotal);
        setDec(dec);
        setMinted(minted);
        setState(state);
        setLogo(logo);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised TokenRecord
     */
    public TokenRecord(com.nacho.entities.jooq.db.tables.pojos.Token value) {
        super(Token.TOKEN);

        if (value != null) {
            setId(value.getId());
            setTick(value.getTick());
            setMax(value.getMax());
            setLim(value.getLim());
            setPre(value.getPre());
            setMtsAdd(value.getMtsAdd());
            setHolderTotal(value.getHolderTotal());
            setDec(value.getDec());
            setMinted(value.getMinted());
            setState(value.getState());
            setLogo(value.getLogo());
            resetChangedOnNotNull();
        }
    }
}
