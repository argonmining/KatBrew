/*
 * This file is generated by jOOQ.
 */
package com.katbrew.entities.jooq.db.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ILastUpdate extends Serializable {

    /**
     * Setter for <code>public.Last_Update.id</code>.
     */
    public void setId(Integer value);

    /**
     * Getter for <code>public.Last_Update.id</code>.
     */
    public Integer getId();

    /**
     * Setter for <code>public.Last_Update.timestamp</code>.
     */
    public void setTimestamp(LocalDateTime value);

    /**
     * Getter for <code>public.Last_Update.timestamp</code>.
     */
    public LocalDateTime getTimestamp();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface ILastUpdate
     */
    public void from(ILastUpdate from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface ILastUpdate
     */
    public <E extends ILastUpdate> E into(E into);
}
