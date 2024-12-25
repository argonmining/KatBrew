/*
 * This file is generated by jOOQ.
 */
package com.katbrew.entities.jooq.db.tables;


import com.katbrew.entities.jooq.db.Keys;
import com.katbrew.entities.jooq.db.Public;
import com.katbrew.entities.jooq.db.tables.Holder.HolderPath;
import com.katbrew.entities.jooq.db.tables.records.BalanceRecord;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.AutoConverter;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Balance extends TableImpl<BalanceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.Balance</code>
     */
    public static final Balance BALANCE = new Balance();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BalanceRecord> getRecordType() {
        return BalanceRecord.class;
    }

    /**
     * The column <code>public.Balance.id</code>.
     */
    public final TableField<BalanceRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.Balance.holder_id</code>.
     */
    public final TableField<BalanceRecord, Integer> HOLDER_ID = createField(DSL.name("holder_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.Balance.balance</code>.
     */
    public final TableField<BalanceRecord, BigInteger> BALANCE_ = createField(DSL.name("balance"), SQLDataType.BIGINT, this, "", new AutoConverter<Long, BigInteger>(Long.class, BigInteger.class));

    /**
     * The column <code>public.Balance.tick</code>.
     */
    public final TableField<BalanceRecord, String> TICK = createField(DSL.name("tick"), SQLDataType.CLOB, this, "");

    private Balance(Name alias, Table<BalanceRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Balance(Name alias, Table<BalanceRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.Balance</code> table reference
     */
    public Balance(String alias) {
        this(DSL.name(alias), BALANCE);
    }

    /**
     * Create an aliased <code>public.Balance</code> table reference
     */
    public Balance(Name alias) {
        this(alias, BALANCE);
    }

    /**
     * Create a <code>public.Balance</code> table reference
     */
    public Balance() {
        this(DSL.name("Balance"), null);
    }

    public <O extends Record> Balance(Table<O> path, ForeignKey<O, BalanceRecord> childPath, InverseForeignKey<O, BalanceRecord> parentPath) {
        super(path, childPath, parentPath, BALANCE);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class BalancePath extends Balance implements Path<BalanceRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> BalancePath(Table<O> path, ForeignKey<O, BalanceRecord> childPath, InverseForeignKey<O, BalanceRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private BalancePath(Name alias, Table<BalanceRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public BalancePath as(String alias) {
            return new BalancePath(DSL.name(alias), this);
        }

        @Override
        public BalancePath as(Name alias) {
            return new BalancePath(alias, this);
        }

        @Override
        public BalancePath as(Table<?> alias) {
            return new BalancePath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<BalanceRecord, Integer> getIdentity() {
        return (Identity<BalanceRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<BalanceRecord> getPrimaryKey() {
        return Keys.PK_BALANCE;
    }

    @Override
    public List<ForeignKey<BalanceRecord, ?>> getReferences() {
        return Arrays.asList(Keys.BALANCE__FK_BALANCE_HOLDER);
    }

    private transient HolderPath _holder;

    /**
     * Get the implicit join path to the <code>public.Holder</code> table.
     */
    public HolderPath holder() {
        if (_holder == null)
            _holder = new HolderPath(this, Keys.BALANCE__FK_BALANCE_HOLDER, null);

        return _holder;
    }

    @Override
    public Balance as(String alias) {
        return new Balance(DSL.name(alias), this);
    }

    @Override
    public Balance as(Name alias) {
        return new Balance(alias, this);
    }

    @Override
    public Balance as(Table<?> alias) {
        return new Balance(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Balance rename(String name) {
        return new Balance(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Balance rename(Name name) {
        return new Balance(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Balance rename(Table<?> name) {
        return new Balance(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Balance where(Condition condition) {
        return new Balance(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Balance where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Balance where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Balance where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Balance where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Balance where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Balance where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Balance where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Balance whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Balance whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
