/*
 * This file is generated by jOOQ.
 */
package com.nacho.entities.jooq.db.tables;


import com.nacho.entities.jooq.db.Keys;
import com.nacho.entities.jooq.db.Public;
import com.nacho.entities.jooq.db.tables.records._PrismaMigrationsRecord;

import java.time.OffsetDateTime;
import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class _PrismaMigrations extends TableImpl<_PrismaMigrationsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public._prisma_migrations</code>
     */
    public static final _PrismaMigrations _PRISMA_MIGRATIONS = new _PrismaMigrations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_PrismaMigrationsRecord> getRecordType() {
        return _PrismaMigrationsRecord.class;
    }

    /**
     * The column <code>public._prisma_migrations.id</code>.
     */
    public final TableField<_PrismaMigrationsRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public._prisma_migrations.checksum</code>.
     */
    public final TableField<_PrismaMigrationsRecord, String> CHECKSUM = createField(DSL.name("checksum"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>public._prisma_migrations.finished_at</code>.
     */
    public final TableField<_PrismaMigrationsRecord, OffsetDateTime> FINISHED_AT = createField(DSL.name("finished_at"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>public._prisma_migrations.migration_name</code>.
     */
    public final TableField<_PrismaMigrationsRecord, String> MIGRATION_NAME = createField(DSL.name("migration_name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public._prisma_migrations.logs</code>.
     */
    public final TableField<_PrismaMigrationsRecord, String> LOGS = createField(DSL.name("logs"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public._prisma_migrations.rolled_back_at</code>.
     */
    public final TableField<_PrismaMigrationsRecord, OffsetDateTime> ROLLED_BACK_AT = createField(DSL.name("rolled_back_at"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>public._prisma_migrations.started_at</code>.
     */
    public final TableField<_PrismaMigrationsRecord, OffsetDateTime> STARTED_AT = createField(DSL.name("started_at"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column <code>public._prisma_migrations.applied_steps_count</code>.
     */
    public final TableField<_PrismaMigrationsRecord, Integer> APPLIED_STEPS_COUNT = createField(DSL.name("applied_steps_count"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    private _PrismaMigrations(Name alias, Table<_PrismaMigrationsRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private _PrismaMigrations(Name alias, Table<_PrismaMigrationsRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public._prisma_migrations</code> table reference
     */
    public _PrismaMigrations(String alias) {
        this(DSL.name(alias), _PRISMA_MIGRATIONS);
    }

    /**
     * Create an aliased <code>public._prisma_migrations</code> table reference
     */
    public _PrismaMigrations(Name alias) {
        this(alias, _PRISMA_MIGRATIONS);
    }

    /**
     * Create a <code>public._prisma_migrations</code> table reference
     */
    public _PrismaMigrations() {
        this(DSL.name("_prisma_migrations"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<_PrismaMigrationsRecord> getPrimaryKey() {
        return Keys._PRISMA_MIGRATIONS_PKEY;
    }

    @Override
    public _PrismaMigrations as(String alias) {
        return new _PrismaMigrations(DSL.name(alias), this);
    }

    @Override
    public _PrismaMigrations as(Name alias) {
        return new _PrismaMigrations(alias, this);
    }

    @Override
    public _PrismaMigrations as(Table<?> alias) {
        return new _PrismaMigrations(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public _PrismaMigrations rename(String name) {
        return new _PrismaMigrations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _PrismaMigrations rename(Name name) {
        return new _PrismaMigrations(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public _PrismaMigrations rename(Table<?> name) {
        return new _PrismaMigrations(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PrismaMigrations where(Condition condition) {
        return new _PrismaMigrations(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PrismaMigrations where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PrismaMigrations where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PrismaMigrations where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public _PrismaMigrations where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public _PrismaMigrations where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public _PrismaMigrations where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public _PrismaMigrations where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PrismaMigrations whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PrismaMigrations whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}