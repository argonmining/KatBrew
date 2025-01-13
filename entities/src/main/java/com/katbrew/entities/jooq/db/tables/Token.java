/*
 * This file is generated by jOOQ.
 */
package com.katbrew.entities.jooq.db.tables;


import com.katbrew.entities.jooq.db.Keys;
import com.katbrew.entities.jooq.db.Public;
import com.katbrew.entities.jooq.db.tables.Balance.BalancePath;
import com.katbrew.entities.jooq.db.tables.PriceData.PriceDataPath;
import com.katbrew.entities.jooq.db.tables.Transaction.TransactionPath;
import com.katbrew.entities.jooq.db.tables.records.TokenRecord;

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
public class Token extends TableImpl<TokenRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.Token</code>
     */
    public static final Token TOKEN = new Token();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TokenRecord> getRecordType() {
        return TokenRecord.class;
    }

    /**
     * The column <code>public.Token.id</code>.
     */
    public final TableField<TokenRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.Token.tick</code>.
     */
    public final TableField<TokenRecord, String> TICK = createField(DSL.name("tick"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.Token.max</code>.
     */
    public final TableField<TokenRecord, BigInteger> MAX = createField(DSL.name("max"), SQLDataType.CLOB, this, "", new AutoConverter<String, BigInteger>(String.class, BigInteger.class));

    /**
     * The column <code>public.Token.lim</code>.
     */
    public final TableField<TokenRecord, BigInteger> LIM = createField(DSL.name("lim"), SQLDataType.CLOB, this, "", new AutoConverter<String, BigInteger>(String.class, BigInteger.class));

    /**
     * The column <code>public.Token.pre</code>.
     */
    public final TableField<TokenRecord, BigInteger> PRE = createField(DSL.name("pre"), SQLDataType.CLOB, this, "", new AutoConverter<String, BigInteger>(String.class, BigInteger.class));

    /**
     * The column <code>public.Token.mts_add</code>.
     */
    public final TableField<TokenRecord, BigInteger> MTS_ADD = createField(DSL.name("mts_add"), SQLDataType.BIGINT, this, "", new AutoConverter<Long, BigInteger>(Long.class, BigInteger.class));

    /**
     * The column <code>public.Token.minted</code>.
     */
    public final TableField<TokenRecord, BigInteger> MINTED = createField(DSL.name("minted"), SQLDataType.CLOB, this, "", new AutoConverter<String, BigInteger>(String.class, BigInteger.class));

    /**
     * The column <code>public.Token.holder_total</code>.
     */
    public final TableField<TokenRecord, Integer> HOLDER_TOTAL = createField(DSL.name("holder_total"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.Token.mint_total</code>.
     */
    public final TableField<TokenRecord, Integer> MINT_TOTAL = createField(DSL.name("mint_total"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.Token.transfer_total</code>.
     */
    public final TableField<TokenRecord, BigInteger> TRANSFER_TOTAL = createField(DSL.name("transfer_total"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.BIGINT)), this, "", new AutoConverter<Long, BigInteger>(Long.class, BigInteger.class));

    /**
     * The column <code>public.Token.dec</code>.
     */
    public final TableField<TokenRecord, Integer> DEC = createField(DSL.name("dec"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.Token.state</code>.
     */
    public final TableField<TokenRecord, String> STATE = createField(DSL.name("state"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.Token.hash_rev</code>.
     */
    public final TableField<TokenRecord, String> HASH_REV = createField(DSL.name("hash_rev"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.Token.op_score_mod</code>.
     */
    public final TableField<TokenRecord, BigInteger> OP_SCORE_MOD = createField(DSL.name("op_score_mod"), SQLDataType.CLOB, this, "", new AutoConverter<String, BigInteger>(String.class, BigInteger.class));

    /**
     * The column <code>public.Token.op_score_add</code>.
     */
    public final TableField<TokenRecord, BigInteger> OP_SCORE_ADD = createField(DSL.name("op_score_add"), SQLDataType.CLOB, this, "", new AutoConverter<String, BigInteger>(String.class, BigInteger.class));

    /**
     * The column <code>public.Token.to</code>.
     */
    public final TableField<TokenRecord, String> TO = createField(DSL.name("to"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.Token.logo</code>.
     */
    public final TableField<TokenRecord, String> LOGO = createField(DSL.name("logo"), SQLDataType.CLOB, this, "");

    private Token(Name alias, Table<TokenRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Token(Name alias, Table<TokenRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.Token</code> table reference
     */
    public Token(String alias) {
        this(DSL.name(alias), TOKEN);
    }

    /**
     * Create an aliased <code>public.Token</code> table reference
     */
    public Token(Name alias) {
        this(alias, TOKEN);
    }

    /**
     * Create a <code>public.Token</code> table reference
     */
    public Token() {
        this(DSL.name("Token"), null);
    }

    public <O extends Record> Token(Table<O> path, ForeignKey<O, TokenRecord> childPath, InverseForeignKey<O, TokenRecord> parentPath) {
        super(path, childPath, parentPath, TOKEN);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class TokenPath extends Token implements Path<TokenRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> TokenPath(Table<O> path, ForeignKey<O, TokenRecord> childPath, InverseForeignKey<O, TokenRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private TokenPath(Name alias, Table<TokenRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public TokenPath as(String alias) {
            return new TokenPath(DSL.name(alias), this);
        }

        @Override
        public TokenPath as(Name alias) {
            return new TokenPath(alias, this);
        }

        @Override
        public TokenPath as(Table<?> alias) {
            return new TokenPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<TokenRecord, Integer> getIdentity() {
        return (Identity<TokenRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<TokenRecord> getPrimaryKey() {
        return Keys.PK_TOKEN;
    }

    @Override
    public List<UniqueKey<TokenRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.TOKEN_TICK_KEY);
    }

    private transient BalancePath _balance;

    /**
     * Get the implicit to-many join path to the <code>public.Balance</code>
     * table
     */
    public BalancePath balance() {
        if (_balance == null)
            _balance = new BalancePath(this, null, Keys.BALANCE__FK_BALANCE_TOKEN.getInverseKey());

        return _balance;
    }

    private transient PriceDataPath _priceData;

    /**
     * Get the implicit to-many join path to the <code>public.Price_Data</code>
     * table
     */
    public PriceDataPath priceData() {
        if (_priceData == null)
            _priceData = new PriceDataPath(this, null, Keys.PRICE_DATA__FK_PRICE_DATA_TOKEN.getInverseKey());

        return _priceData;
    }

    private transient TransactionPath _transaction;

    /**
     * Get the implicit to-many join path to the <code>public.Transaction</code>
     * table
     */
    public TransactionPath transaction() {
        if (_transaction == null)
            _transaction = new TransactionPath(this, null, Keys.TRANSACTION__FK_TRANSACTION_TOKEN.getInverseKey());

        return _transaction;
    }

    @Override
    public Token as(String alias) {
        return new Token(DSL.name(alias), this);
    }

    @Override
    public Token as(Name alias) {
        return new Token(alias, this);
    }

    @Override
    public Token as(Table<?> alias) {
        return new Token(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Token rename(String name) {
        return new Token(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Token rename(Name name) {
        return new Token(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Token rename(Table<?> name) {
        return new Token(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Token where(Condition condition) {
        return new Token(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Token where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Token where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Token where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Token where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Token where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Token where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Token where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Token whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Token whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
