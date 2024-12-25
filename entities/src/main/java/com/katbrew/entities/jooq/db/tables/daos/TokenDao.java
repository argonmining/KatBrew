/*
 * This file is generated by jOOQ.
 */
package com.katbrew.entities.jooq.db.tables.daos;


import com.katbrew.entities.jooq.db.tables.Token;
import com.katbrew.entities.jooq.db.tables.records.TokenRecord;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.AutoConverter;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TokenDao extends DAOImpl<TokenRecord, com.katbrew.entities.jooq.db.tables.pojos.Token, Integer> {

    /**
     * Create a new TokenDao without any configuration
     */
    public TokenDao() {
        super(Token.TOKEN, com.katbrew.entities.jooq.db.tables.pojos.Token.class);
    }

    /**
     * Create a new TokenDao with an attached configuration
     */
    public TokenDao(Configuration configuration) {
        super(Token.TOKEN, com.katbrew.entities.jooq.db.tables.pojos.Token.class, configuration);
    }

    @Override
    public Integer getId(com.katbrew.entities.jooq.db.tables.pojos.Token object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Token.TOKEN.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchById(Integer... values) {
        return fetch(Token.TOKEN.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.katbrew.entities.jooq.db.tables.pojos.Token fetchOneById(Integer value) {
        return fetchOne(Token.TOKEN.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchOptionalById(Integer value) {
        return fetchOptional(Token.TOKEN.ID, value);
    }

    /**
     * Fetch records that have <code>tick BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchRangeOfTick(String lowerInclusive, String upperInclusive) {
        return fetchRange(Token.TOKEN.TICK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tick IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchByTick(String... values) {
        return fetch(Token.TOKEN.TICK, values);
    }

    /**
     * Fetch a unique record that has <code>tick = value</code>
     */
    public com.katbrew.entities.jooq.db.tables.pojos.Token fetchOneByTick(String value) {
        return fetchOne(Token.TOKEN.TICK, value);
    }

    /**
     * Fetch a unique record that has <code>tick = value</code>
     */
    public Optional<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchOptionalByTick(String value) {
        return fetchOptional(Token.TOKEN.TICK, value);
    }

    /**
     * Fetch records that have <code>max BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchRangeOfMax(BigInteger lowerInclusive, BigInteger upperInclusive) {
        return fetchRange(Token.TOKEN.MAX, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>max IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchByMax(BigInteger... values) {
        return fetch(Token.TOKEN.MAX, values);
    }

    /**
     * Fetch records that have <code>lim BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchRangeOfLim(BigInteger lowerInclusive, BigInteger upperInclusive) {
        return fetchRange(Token.TOKEN.LIM, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>lim IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchByLim(BigInteger... values) {
        return fetch(Token.TOKEN.LIM, values);
    }

    /**
     * Fetch records that have <code>pre BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchRangeOfPre(BigInteger lowerInclusive, BigInteger upperInclusive) {
        return fetchRange(Token.TOKEN.PRE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>pre IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchByPre(BigInteger... values) {
        return fetch(Token.TOKEN.PRE, values);
    }

    /**
     * Fetch records that have <code>mts_add BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchRangeOfMtsAdd(BigInteger lowerInclusive, BigInteger upperInclusive) {
        return fetchRange(Token.TOKEN.MTS_ADD, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>mts_add IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchByMtsAdd(BigInteger... values) {
        return fetch(Token.TOKEN.MTS_ADD, values);
    }

    /**
     * Fetch records that have <code>minted BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchRangeOfMinted(BigInteger lowerInclusive, BigInteger upperInclusive) {
        return fetchRange(Token.TOKEN.MINTED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>minted IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchByMinted(BigInteger... values) {
        return fetch(Token.TOKEN.MINTED, values);
    }

    /**
     * Fetch records that have <code>holder_total BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchRangeOfHolderTotal(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Token.TOKEN.HOLDER_TOTAL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>holder_total IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchByHolderTotal(Integer... values) {
        return fetch(Token.TOKEN.HOLDER_TOTAL, values);
    }

    /**
     * Fetch records that have <code>dec BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchRangeOfDec(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Token.TOKEN.DEC, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>dec IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchByDec(Integer... values) {
        return fetch(Token.TOKEN.DEC, values);
    }

    /**
     * Fetch records that have <code>state BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchRangeOfState(String lowerInclusive, String upperInclusive) {
        return fetchRange(Token.TOKEN.STATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>state IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchByState(String... values) {
        return fetch(Token.TOKEN.STATE, values);
    }

    /**
     * Fetch records that have <code>logo BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchRangeOfLogo(String lowerInclusive, String upperInclusive) {
        return fetchRange(Token.TOKEN.LOGO, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>logo IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Token> fetchByLogo(String... values) {
        return fetch(Token.TOKEN.LOGO, values);
    }
}
