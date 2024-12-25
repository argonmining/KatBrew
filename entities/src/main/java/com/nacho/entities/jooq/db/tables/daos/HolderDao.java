/*
 * This file is generated by jOOQ.
 */
package com.nacho.entities.jooq.db.tables.daos;


import com.nacho.entities.jooq.db.tables.Holder;
import com.nacho.entities.jooq.db.tables.records.HolderRecord;

import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HolderDao extends DAOImpl<HolderRecord, com.nacho.entities.jooq.db.tables.pojos.Holder, Integer> {

    /**
     * Create a new HolderDao without any configuration
     */
    public HolderDao() {
        super(Holder.HOLDER, com.nacho.entities.jooq.db.tables.pojos.Holder.class);
    }

    /**
     * Create a new HolderDao with an attached configuration
     */
    public HolderDao(Configuration configuration) {
        super(Holder.HOLDER, com.nacho.entities.jooq.db.tables.pojos.Holder.class, configuration);
    }

    @Override
    public Integer getId(com.nacho.entities.jooq.db.tables.pojos.Holder object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.nacho.entities.jooq.db.tables.pojos.Holder> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Holder.HOLDER.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.nacho.entities.jooq.db.tables.pojos.Holder> fetchById(Integer... values) {
        return fetch(Holder.HOLDER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.nacho.entities.jooq.db.tables.pojos.Holder fetchOneById(Integer value) {
        return fetchOne(Holder.HOLDER.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<com.nacho.entities.jooq.db.tables.pojos.Holder> fetchOptionalById(Integer value) {
        return fetchOptional(Holder.HOLDER.ID, value);
    }

    /**
     * Fetch records that have <code>address BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.nacho.entities.jooq.db.tables.pojos.Holder> fetchRangeOfAddress(String lowerInclusive, String upperInclusive) {
        return fetchRange(Holder.HOLDER.ADDRESS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>address IN (values)</code>
     */
    public List<com.nacho.entities.jooq.db.tables.pojos.Holder> fetchByAddress(String... values) {
        return fetch(Holder.HOLDER.ADDRESS, values);
    }

    /**
     * Fetch a unique record that has <code>address = value</code>
     */
    public com.nacho.entities.jooq.db.tables.pojos.Holder fetchOneByAddress(String value) {
        return fetchOne(Holder.HOLDER.ADDRESS, value);
    }

    /**
     * Fetch a unique record that has <code>address = value</code>
     */
    public Optional<com.nacho.entities.jooq.db.tables.pojos.Holder> fetchOptionalByAddress(String value) {
        return fetchOptional(Holder.HOLDER.ADDRESS, value);
    }
}
