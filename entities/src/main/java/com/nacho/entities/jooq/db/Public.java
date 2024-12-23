/*
 * This file is generated by jOOQ.
 */
package com.nacho.entities.jooq.db;


import com.nacho.entities.jooq.db.tables.Announcements;
import com.nacho.entities.jooq.db.tables.Balance;
import com.nacho.entities.jooq.db.tables.Holder;
import com.nacho.entities.jooq.db.tables.Lastupdate;
import com.nacho.entities.jooq.db.tables.Pricedata;
import com.nacho.entities.jooq.db.tables.Token;
import com.nacho.entities.jooq.db.tables.Tokens;
import com.nacho.entities.jooq.db.tables.Transaction;
import com.nacho.entities.jooq.db.tables.Users;
import com.nacho.entities.jooq.db.tables._PrismaMigrations;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public._prisma_migrations</code>.
     */
    public final _PrismaMigrations _PRISMA_MIGRATIONS = _PrismaMigrations._PRISMA_MIGRATIONS;

    /**
     * The table <code>public.Announcements</code>.
     */
    public final Announcements ANNOUNCEMENTS = Announcements.ANNOUNCEMENTS;

    /**
     * The table <code>public.Balance</code>.
     */
    public final Balance BALANCE = Balance.BALANCE;

    /**
     * The table <code>public.Holder</code>.
     */
    public final Holder HOLDER = Holder.HOLDER;

    /**
     * The table <code>public.LastUpdate</code>.
     */
    public final Lastupdate LASTUPDATE = Lastupdate.LASTUPDATE;

    /**
     * The table <code>public.PriceData</code>.
     */
    public final Pricedata PRICEDATA = Pricedata.PRICEDATA;

    /**
     * The table <code>public.Token</code>.
     */
    public final Token TOKEN = Token.TOKEN;

    /**
     * The table <code>public.Tokens</code>.
     */
    public final Tokens TOKENS = Tokens.TOKENS;

    /**
     * The table <code>public.Transaction</code>.
     */
    public final Transaction TRANSACTION = Transaction.TRANSACTION;

    /**
     * The table <code>public.Users</code>.
     */
    public final Users USERS = Users.USERS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        return Arrays.asList(
            Sequences.ANNOUNCEMENTS_ID_SEQ,
            Sequences.BALANCE_ID_SEQ,
            Sequences.HOLDER_ID_SEQ,
            Sequences.PRICEDATA_ID_SEQ
        );
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            _PrismaMigrations._PRISMA_MIGRATIONS,
            Announcements.ANNOUNCEMENTS,
            Balance.BALANCE,
            Holder.HOLDER,
            Lastupdate.LASTUPDATE,
            Pricedata.PRICEDATA,
            Token.TOKEN,
            Tokens.TOKENS,
            Transaction.TRANSACTION,
            Users.USERS
        );
    }
}
