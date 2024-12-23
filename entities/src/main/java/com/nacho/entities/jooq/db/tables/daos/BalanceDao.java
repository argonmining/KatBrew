/*
 * This file is generated by jOOQ.
 */
package com.nacho.entities.jooq.db.tables.daos;


import com.nacho.entities.jooq.db.tables.Balance;
import com.nacho.entities.jooq.db.tables.records.BalanceRecord;

import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BalanceDao extends DAOImpl<BalanceRecord, com.nacho.entities.jooq.db.tables.pojos.Balance, Integer> {

    /**
     * Create a new BalanceDao without any configuration
     */
    public BalanceDao() {
        super(Balance.BALANCE, com.nacho.entities.jooq.db.tables.pojos.Balance.class);
    }

    /**
     * Create a new BalanceDao with an attached configuration
     */
    public BalanceDao(Configuration configuration) {
        super(Balance.BALANCE, com.nacho.entities.jooq.db.tables.pojos.Balance.class, configuration);
    }

    @Override
    public Integer getId(com.nacho.entities.jooq.db.tables.pojos.Balance object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.nacho.entities.jooq.db.tables.pojos.Balance> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Balance.BALANCE.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.nacho.entities.jooq.db.tables.pojos.Balance> fetchById(Integer... values) {
        return fetch(Balance.BALANCE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.nacho.entities.jooq.db.tables.pojos.Balance fetchOneById(Integer value) {
        return fetchOne(Balance.BALANCE.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<com.nacho.entities.jooq.db.tables.pojos.Balance> fetchOptionalById(Integer value) {
        return fetchOptional(Balance.BALANCE.ID, value);
    }

    /**
     * Fetch records that have <code>balance BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.nacho.entities.jooq.db.tables.pojos.Balance> fetchRangeOfBalance(String lowerInclusive, String upperInclusive) {
        return fetchRange(Balance.BALANCE.BALANCE_, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>balance IN (values)</code>
     */
    public List<com.nacho.entities.jooq.db.tables.pojos.Balance> fetchByBalance(String... values) {
        return fetch(Balance.BALANCE.BALANCE_, values);
    }

    /**
     * Fetch records that have <code>holderId BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.nacho.entities.jooq.db.tables.pojos.Balance> fetchRangeOfHolderid(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Balance.BALANCE.HOLDERID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>holderId IN (values)</code>
     */
    public List<com.nacho.entities.jooq.db.tables.pojos.Balance> fetchByHolderid(Integer... values) {
        return fetch(Balance.BALANCE.HOLDERID, values);
    }

    /**
     * Fetch records that have <code>tokenTick BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.nacho.entities.jooq.db.tables.pojos.Balance> fetchRangeOfTokentick(String lowerInclusive, String upperInclusive) {
        return fetchRange(Balance.BALANCE.TOKENTICK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tokenTick IN (values)</code>
     */
    public List<com.nacho.entities.jooq.db.tables.pojos.Balance> fetchByTokentick(String... values) {
        return fetch(Balance.BALANCE.TOKENTICK, values);
    }
}
