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
import com.nacho.entities.jooq.db.tables.records.AnnouncementsRecord;
import com.nacho.entities.jooq.db.tables.records.BalanceRecord;
import com.nacho.entities.jooq.db.tables.records.HolderRecord;
import com.nacho.entities.jooq.db.tables.records.LastupdateRecord;
import com.nacho.entities.jooq.db.tables.records.PricedataRecord;
import com.nacho.entities.jooq.db.tables.records.TokenRecord;
import com.nacho.entities.jooq.db.tables.records.TokensRecord;
import com.nacho.entities.jooq.db.tables.records.TransactionRecord;
import com.nacho.entities.jooq.db.tables.records.UsersRecord;
import com.nacho.entities.jooq.db.tables.records._PrismaMigrationsRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<_PrismaMigrationsRecord> _PRISMA_MIGRATIONS_PKEY = Internal.createUniqueKey(_PrismaMigrations._PRISMA_MIGRATIONS, DSL.name("_prisma_migrations_pkey"), new TableField[] { _PrismaMigrations._PRISMA_MIGRATIONS.ID }, true);
    public static final UniqueKey<AnnouncementsRecord> ANNOUNCEMENTS_PKEY = Internal.createUniqueKey(Announcements.ANNOUNCEMENTS, DSL.name("Announcements_pkey"), new TableField[] { Announcements.ANNOUNCEMENTS.ID }, true);
    public static final UniqueKey<BalanceRecord> BALANCE_PKEY = Internal.createUniqueKey(Balance.BALANCE, DSL.name("Balance_pkey"), new TableField[] { Balance.BALANCE.ID }, true);
    public static final UniqueKey<HolderRecord> HOLDER_PKEY = Internal.createUniqueKey(Holder.HOLDER, DSL.name("Holder_pkey"), new TableField[] { Holder.HOLDER.ID }, true);
    public static final UniqueKey<LastupdateRecord> LASTUPDATE_PKEY = Internal.createUniqueKey(Lastupdate.LASTUPDATE, DSL.name("LastUpdate_pkey"), new TableField[] { Lastupdate.LASTUPDATE.ID }, true);
    public static final UniqueKey<PricedataRecord> PRICEDATA_PKEY = Internal.createUniqueKey(Pricedata.PRICEDATA, DSL.name("PriceData_pkey"), new TableField[] { Pricedata.PRICEDATA.ID }, true);
    public static final UniqueKey<TokenRecord> TOKEN_PKEY = Internal.createUniqueKey(Token.TOKEN, DSL.name("Token_pkey"), new TableField[] { Token.TOKEN.TICK }, true);
    public static final UniqueKey<TokensRecord> PK_TOKENS = Internal.createUniqueKey(Tokens.TOKENS, DSL.name("pk_tokens"), new TableField[] { Tokens.TOKENS.ID }, true);
    public static final UniqueKey<TransactionRecord> TRANSACTION_PKEY = Internal.createUniqueKey(Transaction.TRANSACTION, DSL.name("Transaction_pkey"), new TableField[] { Transaction.TRANSACTION.HASHREV }, true);
    public static final UniqueKey<UsersRecord> PK_USERS = Internal.createUniqueKey(Users.USERS, DSL.name("pk_users"), new TableField[] { Users.USERS.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BalanceRecord, HolderRecord> BALANCE__BALANCE_HOLDERID_FKEY = Internal.createForeignKey(Balance.BALANCE, DSL.name("Balance_holderId_fkey"), new TableField[] { Balance.BALANCE.HOLDERID }, Keys.HOLDER_PKEY, new TableField[] { Holder.HOLDER.ID }, true);
    public static final ForeignKey<BalanceRecord, TokenRecord> BALANCE__BALANCE_TOKENTICK_FKEY = Internal.createForeignKey(Balance.BALANCE, DSL.name("Balance_tokenTick_fkey"), new TableField[] { Balance.BALANCE.TOKENTICK }, Keys.TOKEN_PKEY, new TableField[] { Token.TOKEN.TICK }, true);
    public static final ForeignKey<PricedataRecord, TokenRecord> PRICEDATA__PRICEDATA_TICK_FKEY = Internal.createForeignKey(Pricedata.PRICEDATA, DSL.name("PriceData_tick_fkey"), new TableField[] { Pricedata.PRICEDATA.TICK }, Keys.TOKEN_PKEY, new TableField[] { Token.TOKEN.TICK }, true);
    public static final ForeignKey<TransactionRecord, TokenRecord> TRANSACTION__TRANSACTION_TICK_FKEY = Internal.createForeignKey(Transaction.TRANSACTION, DSL.name("Transaction_tick_fkey"), new TableField[] { Transaction.TRANSACTION.TICK }, Keys.TOKEN_PKEY, new TableField[] { Token.TOKEN.TICK }, true);
}