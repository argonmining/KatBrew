/*
 * This file is generated by jOOQ.
 */
package com.katbrew.entities.jooq.db.tables.daos;


import com.katbrew.entities.jooq.db.tables.Announcements;
import com.katbrew.entities.jooq.db.tables.records.AnnouncementsRecord;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AnnouncementsDao extends DAOImpl<AnnouncementsRecord, com.katbrew.entities.jooq.db.tables.pojos.Announcements, Integer> {

    /**
     * Create a new AnnouncementsDao without any configuration
     */
    public AnnouncementsDao() {
        super(Announcements.ANNOUNCEMENTS, com.katbrew.entities.jooq.db.tables.pojos.Announcements.class);
    }

    /**
     * Create a new AnnouncementsDao with an attached configuration
     */
    public AnnouncementsDao(Configuration configuration) {
        super(Announcements.ANNOUNCEMENTS, com.katbrew.entities.jooq.db.tables.pojos.Announcements.class, configuration);
    }

    @Override
    public Integer getId(com.katbrew.entities.jooq.db.tables.pojos.Announcements object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Announcements> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Announcements.ANNOUNCEMENTS.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Announcements> fetchById(Integer... values) {
        return fetch(Announcements.ANNOUNCEMENTS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.katbrew.entities.jooq.db.tables.pojos.Announcements fetchOneById(Integer value) {
        return fetchOne(Announcements.ANNOUNCEMENTS.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<com.katbrew.entities.jooq.db.tables.pojos.Announcements> fetchOptionalById(Integer value) {
        return fetchOptional(Announcements.ANNOUNCEMENTS.ID, value);
    }

    /**
     * Fetch records that have <code>title BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Announcements> fetchRangeOfTitle(String lowerInclusive, String upperInclusive) {
        return fetchRange(Announcements.ANNOUNCEMENTS.TITLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Announcements> fetchByTitle(String... values) {
        return fetch(Announcements.ANNOUNCEMENTS.TITLE, values);
    }

    /**
     * Fetch records that have <code>text BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Announcements> fetchRangeOfText(String lowerInclusive, String upperInclusive) {
        return fetchRange(Announcements.ANNOUNCEMENTS.TEXT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>text IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Announcements> fetchByText(String... values) {
        return fetch(Announcements.ANNOUNCEMENTS.TEXT, values);
    }

    /**
     * Fetch records that have <code>image_url BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Announcements> fetchRangeOfImageUrl(String lowerInclusive, String upperInclusive) {
        return fetchRange(Announcements.ANNOUNCEMENTS.IMAGE_URL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>image_url IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Announcements> fetchByImageUrl(String... values) {
        return fetch(Announcements.ANNOUNCEMENTS.IMAGE_URL, values);
    }

    /**
     * Fetch records that have <code>link BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Announcements> fetchRangeOfLink(String lowerInclusive, String upperInclusive) {
        return fetchRange(Announcements.ANNOUNCEMENTS.LINK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>link IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Announcements> fetchByLink(String... values) {
        return fetch(Announcements.ANNOUNCEMENTS.LINK, values);
    }

    /**
     * Fetch records that have <code>timestamp BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Announcements> fetchRangeOfTimestamp(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Announcements.ANNOUNCEMENTS.TIMESTAMP, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>timestamp IN (values)</code>
     */
    public List<com.katbrew.entities.jooq.db.tables.pojos.Announcements> fetchByTimestamp(LocalDateTime... values) {
        return fetch(Announcements.ANNOUNCEMENTS.TIMESTAMP, values);
    }
}
