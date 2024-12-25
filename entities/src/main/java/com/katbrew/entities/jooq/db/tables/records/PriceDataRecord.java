/*
 * This file is generated by jOOQ.
 */
package com.katbrew.entities.jooq.db.tables.records;


import com.katbrew.entities.jooq.db.tables.PriceData;
import com.katbrew.entities.jooq.db.tables.interfaces.IPriceData;

import java.math.BigInteger;
import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PriceDataRecord extends UpdatableRecordImpl<PriceDataRecord> implements IPriceData {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.Price_Data.id</code>.
     */
    @Override
    public void setId(BigInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.Price_Data.id</code>.
     */
    @Override
    public BigInteger getId() {
        return (BigInteger) get(0);
    }

    /**
     * Setter for <code>public.Price_Data.fk_token</code>.
     */
    @Override
    public void setFkToken(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.Price_Data.fk_token</code>.
     */
    @Override
    public Integer getFkToken() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.Price_Data.value_kas</code>.
     */
    @Override
    public void setValueKas(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.Price_Data.value_kas</code>.
     */
    @Override
    public Double getValueKas() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>public.Price_Data.value_usd</code>.
     */
    @Override
    public void setValueUsd(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.Price_Data.value_usd</code>.
     */
    @Override
    public Double getValueUsd() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>public.Price_Data.change_24h</code>.
     */
    @Override
    public void setChange_24h(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.Price_Data.change_24h</code>.
     */
    @Override
    public Double getChange_24h() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>public.Price_Data.timestamp</code>.
     */
    @Override
    public void setTimestamp(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.Price_Data.timestamp</code>.
     */
    @Override
    public LocalDateTime getTimestamp() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<BigInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IPriceData from) {
        setId(from.getId());
        setFkToken(from.getFkToken());
        setValueKas(from.getValueKas());
        setValueUsd(from.getValueUsd());
        setChange_24h(from.getChange_24h());
        setTimestamp(from.getTimestamp());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IPriceData> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PriceDataRecord
     */
    public PriceDataRecord() {
        super(PriceData.PRICE_DATA);
    }

    /**
     * Create a detached, initialised PriceDataRecord
     */
    public PriceDataRecord(BigInteger id, Integer fkToken, Double valueKas, Double valueUsd, Double change_24h, LocalDateTime timestamp) {
        super(PriceData.PRICE_DATA);

        setId(id);
        setFkToken(fkToken);
        setValueKas(valueKas);
        setValueUsd(valueUsd);
        setChange_24h(change_24h);
        setTimestamp(timestamp);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PriceDataRecord
     */
    public PriceDataRecord(com.katbrew.entities.jooq.db.tables.pojos.PriceData value) {
        super(PriceData.PRICE_DATA);

        if (value != null) {
            setId(value.getId());
            setFkToken(value.getFkToken());
            setValueKas(value.getValueKas());
            setValueUsd(value.getValueUsd());
            setChange_24h(value.getChange_24h());
            setTimestamp(value.getTimestamp());
            resetChangedOnNotNull();
        }
    }
}
