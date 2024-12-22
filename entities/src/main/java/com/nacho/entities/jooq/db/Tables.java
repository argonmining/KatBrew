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


/**
 * Convenience access to all tables in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public._prisma_migrations</code>.
     */
    public static final _PrismaMigrations _PRISMA_MIGRATIONS = _PrismaMigrations._PRISMA_MIGRATIONS;

    /**
     * The table <code>public.Announcements</code>.
     */
    public static final Announcements ANNOUNCEMENTS = Announcements.ANNOUNCEMENTS;

    /**
     * The table <code>public.Balance</code>.
     */
    public static final Balance BALANCE = Balance.BALANCE;

    /**
     * The table <code>public.Holder</code>.
     */
    public static final Holder HOLDER = Holder.HOLDER;

    /**
     * The table <code>public.LastUpdate</code>.
     */
    public static final Lastupdate LASTUPDATE = Lastupdate.LASTUPDATE;

    /**
     * The table <code>public.PriceData</code>.
     */
    public static final Pricedata PRICEDATA = Pricedata.PRICEDATA;

    /**
     * The table <code>public.Token</code>.
     */
    public static final Token TOKEN = Token.TOKEN;

    /**
     * The table <code>public.Tokens</code>.
     */
    public static final Tokens TOKENS = Tokens.TOKENS;

    /**
     * The table <code>public.Transaction</code>.
     */
    public static final Transaction TRANSACTION = Transaction.TRANSACTION;

    /**
     * The table <code>public.Users</code>.
     */
    public static final Users USERS = Users.USERS;
}