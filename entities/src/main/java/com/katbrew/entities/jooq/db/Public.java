/*
 * This file is generated by jOOQ.
 */
package com.katbrew.entities.jooq.db;


import com.katbrew.entities.jooq.db.tables.Announcements;
import com.katbrew.entities.jooq.db.tables.Balance;
import com.katbrew.entities.jooq.db.tables.Holder;
import com.katbrew.entities.jooq.db.tables.LastUpdate;
import com.katbrew.entities.jooq.db.tables.PriceData;
import com.katbrew.entities.jooq.db.tables.Token;
import com.katbrew.entities.jooq.db.tables.TopHolder;
import com.katbrew.entities.jooq.db.tables.Transaction;
import com.katbrew.entities.jooq.db.tables.Users;
import com.katbrew.entities.jooq.db.tables.Whitelist;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
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
     * The table <code>public.Last_Update</code>.
     */
    public final LastUpdate LAST_UPDATE = LastUpdate.LAST_UPDATE;

    /**
     * The table <code>public.Price_Data</code>.
     */
    public final PriceData PRICE_DATA = PriceData.PRICE_DATA;

    /**
     * The table <code>public.Token</code>.
     */
    public final Token TOKEN = Token.TOKEN;

    /**
     * The table <code>public.Top_Holder</code>.
     */
    public final TopHolder TOP_HOLDER = TopHolder.TOP_HOLDER;

    /**
     * The table <code>public.Transaction</code>.
     */
    public final Transaction TRANSACTION = Transaction.TRANSACTION;

    /**
     * The table <code>public.Users</code>.
     */
    public final Users USERS = Users.USERS;

    /**
     * The table <code>public.Whitelist</code>.
     */
    public final Whitelist WHITELIST = Whitelist.WHITELIST;

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
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Announcements.ANNOUNCEMENTS,
            Balance.BALANCE,
            Holder.HOLDER,
            LastUpdate.LAST_UPDATE,
            PriceData.PRICE_DATA,
            Token.TOKEN,
            TopHolder.TOP_HOLDER,
            Transaction.TRANSACTION,
            Users.USERS,
            Whitelist.WHITELIST
        );
    }
}
