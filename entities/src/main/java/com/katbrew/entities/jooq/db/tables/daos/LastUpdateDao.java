/*
 * This file is generated by jOOQ.
 */
package com.katbrew.entities.jooq.db.tables.daos;


import com.katbrew.entities.jooq.db.tables.LastUpdate;
import com.katbrew.entities.jooq.db.tables.records.LastUpdateRecord;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LastUpdateDao extends DAOImpl<LastUpdateRecord, com.katbrew.entities.jooq.db.tables.pojos.LastUpdate, Integer> {

    /**
     * Create a new LastUpdateDao without any configuration
     */
    public LastUpdateDao() {
        super(LastUpdate.LAST_UPDATE, com.katbrew.entities.jooq.db.tables.pojos.LastUpdate.class);
    }

    /**
     * Create a new LastUpdateDao with an attached configuration
     */
    public LastUpdateDao(Configuration configuration) {
        super(LastUpdate.LAST_UPDATE, com.katbrew.entities.jooq.db.tables.pojos.LastUpdate.class, configuration);
    }

    @Override
    public Integer getId(com.katbrew.entities.jooq.db.tables.pojos.LastUpdate object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.LastUpdate> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(LastUpdate.LAST_UPDATE.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.LastUpdate> fetchById(Integer... values) {
        return fetch(LastUpdate.LAST_UPDATE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.katbrew.entities.jooq.db.tables.pojos.LastUpdate fetchOneById(Integer value) {
        return fetchOne(LastUpdate.LAST_UPDATE.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<com.katbrew.entities.jooq.db.tables.pojos.LastUpdate> fetchOptionalById(Integer value) {
        return fetchOptional(LastUpdate.LAST_UPDATE.ID, value);
    }

    /**
     * Fetch records that have <code>identifier BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.LastUpdate> fetchRangeOfIdentifier(String lowerInclusive, String upperInclusive) {
        return fetchRange(LastUpdate.LAST_UPDATE.IDENTIFIER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>identifier IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.LastUpdate> fetchByIdentifier(String... values) {
        return fetch(LastUpdate.LAST_UPDATE.IDENTIFIER, values);
    }

    /**
     * Fetch a unique record that has <code>identifier = value</code>
     */
    public com.katbrew.entities.jooq.db.tables.pojos.LastUpdate fetchOneByIdentifier(String value) {
        return fetchOne(LastUpdate.LAST_UPDATE.IDENTIFIER, value);
    }

    /**
     * Fetch a unique record that has <code>identifier = value</code>
     */
    public Optional<com.katbrew.entities.jooq.db.tables.pojos.LastUpdate> fetchOptionalByIdentifier(String value) {
        return fetchOptional(LastUpdate.LAST_UPDATE.IDENTIFIER, value);
    }

    /**
     * Fetch records that have <code>data BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.LastUpdate> fetchRangeOfData(String lowerInclusive, String upperInclusive) {
        return fetchRange(LastUpdate.LAST_UPDATE.DATA, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>data IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.LastUpdate> fetchByData(String... values) {
        return fetch(LastUpdate.LAST_UPDATE.DATA, values);
    }

    /**
     * Fetch records that have <code>timestamp BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.LastUpdate> fetchRangeOfTimestamp(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(LastUpdate.LAST_UPDATE.TIMESTAMP, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>timestamp IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.LastUpdate> fetchByTimestamp(LocalDateTime... values) {
        return fetch(LastUpdate.LAST_UPDATE.TIMESTAMP, values);
    }
}
