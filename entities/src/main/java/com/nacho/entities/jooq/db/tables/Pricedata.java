/*
 * This file is generated by jOOQ.
 */
package com.nacho.entities.jooq.db.tables;


import com.nacho.entities.jooq.db.Indexes;
import com.nacho.entities.jooq.db.Keys;
import com.nacho.entities.jooq.db.Public;
import com.nacho.entities.jooq.db.tables.Token.TokenPath;
import com.nacho.entities.jooq.db.tables.records.PricedataRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Pricedata extends TableImpl<PricedataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.PriceData</code>
     */
    public static final Pricedata PRICEDATA = new Pricedata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PricedataRecord> getRecordType() {
        return PricedataRecord.class;
    }

    /**
     * The column <code>public.PriceData.id</code>.
     */
    public final TableField<PricedataRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("nextval('\"PriceData_id_seq\"'::regclass)"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.PriceData.tick</code>.
     */
    public final TableField<PricedataRecord, String> TICK = createField(DSL.name("tick"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.PriceData.timestamp</code>.
     */
    public final TableField<PricedataRecord, LocalDateTime> TIMESTAMP = createField(DSL.name("timestamp"), SQLDataType.LOCALDATETIME(3).nullable(false), this, "");

    /**
     * The column <code>public.PriceData.valueKAS</code>.
     */
    public final TableField<PricedataRecord, Double> VALUEKAS = createField(DSL.name("valueKAS"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>public.PriceData.valueUSD</code>.
     */
    public final TableField<PricedataRecord, Double> VALUEUSD = createField(DSL.name("valueUSD"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>public.PriceData.change24h</code>.
     */
    public final TableField<PricedataRecord, Double> CHANGE24H = createField(DSL.name("change24h"), SQLDataType.DOUBLE.nullable(false), this, "");

    private Pricedata(Name alias, Table<PricedataRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Pricedata(Name alias, Table<PricedataRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.PriceData</code> table reference
     */
    public Pricedata(String alias) {
        this(DSL.name(alias), PRICEDATA);
    }

    /**
     * Create an aliased <code>public.PriceData</code> table reference
     */
    public Pricedata(Name alias) {
        this(alias, PRICEDATA);
    }

    /**
     * Create a <code>public.PriceData</code> table reference
     */
    public Pricedata() {
        this(DSL.name("PriceData"), null);
    }

    public <O extends Record> Pricedata(Table<O> path, ForeignKey<O, PricedataRecord> childPath, InverseForeignKey<O, PricedataRecord> parentPath) {
        super(path, childPath, parentPath, PRICEDATA);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class PricedataPath extends Pricedata implements Path<PricedataRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> PricedataPath(Table<O> path, ForeignKey<O, PricedataRecord> childPath, InverseForeignKey<O, PricedataRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private PricedataPath(Name alias, Table<PricedataRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public PricedataPath as(String alias) {
            return new PricedataPath(DSL.name(alias), this);
        }

        @Override
        public PricedataPath as(Name alias) {
            return new PricedataPath(alias, this);
        }

        @Override
        public PricedataPath as(Table<?> alias) {
            return new PricedataPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PRICEDATA_TICK_TIMESTAMP_IDX);
    }

    @Override
    public UniqueKey<PricedataRecord> getPrimaryKey() {
        return Keys.PRICEDATA_PKEY;
    }

    @Override
    public List<ForeignKey<PricedataRecord, ?>> getReferences() {
        return Arrays.asList(Keys.PRICEDATA__PRICEDATA_TICK_FKEY);
    }

    private transient TokenPath _token;

    /**
     * Get the implicit join path to the <code>public.Token</code> table.
     */
    public TokenPath token() {
        if (_token == null)
            _token = new TokenPath(this, Keys.PRICEDATA__PRICEDATA_TICK_FKEY, null);

        return _token;
    }

    @Override
    public Pricedata as(String alias) {
        return new Pricedata(DSL.name(alias), this);
    }

    @Override
    public Pricedata as(Name alias) {
        return new Pricedata(alias, this);
    }

    @Override
    public Pricedata as(Table<?> alias) {
        return new Pricedata(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Pricedata rename(String name) {
        return new Pricedata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Pricedata rename(Name name) {
        return new Pricedata(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Pricedata rename(Table<?> name) {
        return new Pricedata(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Pricedata where(Condition condition) {
        return new Pricedata(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Pricedata where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Pricedata where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Pricedata where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Pricedata where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Pricedata where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Pricedata where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Pricedata where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Pricedata whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Pricedata whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}