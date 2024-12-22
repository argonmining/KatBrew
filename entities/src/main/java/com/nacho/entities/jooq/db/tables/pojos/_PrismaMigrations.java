/*
 * This file is generated by jOOQ.
 */
package com.nacho.entities.jooq.db.tables.pojos;


import com.nacho.entities.jooq.db.tables.interfaces.I_PrismaMigrations;

import java.time.OffsetDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class _PrismaMigrations implements I_PrismaMigrations {

    private static final long serialVersionUID = 1L;

    private String id;
    private String checksum;
    private OffsetDateTime finishedAt;
    private String migrationName;
    private String logs;
    private OffsetDateTime rolledBackAt;
    private OffsetDateTime startedAt;
    private Integer appliedStepsCount;

    public _PrismaMigrations() {}

    public _PrismaMigrations(I_PrismaMigrations value) {
        this.id = value.getId();
        this.checksum = value.getChecksum();
        this.finishedAt = value.getFinishedAt();
        this.migrationName = value.getMigrationName();
        this.logs = value.getLogs();
        this.rolledBackAt = value.getRolledBackAt();
        this.startedAt = value.getStartedAt();
        this.appliedStepsCount = value.getAppliedStepsCount();
    }

    public _PrismaMigrations(
        String id,
        String checksum,
        OffsetDateTime finishedAt,
        String migrationName,
        String logs,
        OffsetDateTime rolledBackAt,
        OffsetDateTime startedAt,
        Integer appliedStepsCount
    ) {
        this.id = id;
        this.checksum = checksum;
        this.finishedAt = finishedAt;
        this.migrationName = migrationName;
        this.logs = logs;
        this.rolledBackAt = rolledBackAt;
        this.startedAt = startedAt;
        this.appliedStepsCount = appliedStepsCount;
    }

    /**
     * Getter for <code>public._prisma_migrations.id</code>.
     */
    @Override
    public String getId() {
        return this.id;
    }

    /**
     * Setter for <code>public._prisma_migrations.id</code>.
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for <code>public._prisma_migrations.checksum</code>.
     */
    @Override
    public String getChecksum() {
        return this.checksum;
    }

    /**
     * Setter for <code>public._prisma_migrations.checksum</code>.
     */
    @Override
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * Getter for <code>public._prisma_migrations.finished_at</code>.
     */
    @Override
    public OffsetDateTime getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * Setter for <code>public._prisma_migrations.finished_at</code>.
     */
    @Override
    public void setFinishedAt(OffsetDateTime finishedAt) {
        this.finishedAt = finishedAt;
    }

    /**
     * Getter for <code>public._prisma_migrations.migration_name</code>.
     */
    @Override
    public String getMigrationName() {
        return this.migrationName;
    }

    /**
     * Setter for <code>public._prisma_migrations.migration_name</code>.
     */
    @Override
    public void setMigrationName(String migrationName) {
        this.migrationName = migrationName;
    }

    /**
     * Getter for <code>public._prisma_migrations.logs</code>.
     */
    @Override
    public String getLogs() {
        return this.logs;
    }

    /**
     * Setter for <code>public._prisma_migrations.logs</code>.
     */
    @Override
    public void setLogs(String logs) {
        this.logs = logs;
    }

    /**
     * Getter for <code>public._prisma_migrations.rolled_back_at</code>.
     */
    @Override
    public OffsetDateTime getRolledBackAt() {
        return this.rolledBackAt;
    }

    /**
     * Setter for <code>public._prisma_migrations.rolled_back_at</code>.
     */
    @Override
    public void setRolledBackAt(OffsetDateTime rolledBackAt) {
        this.rolledBackAt = rolledBackAt;
    }

    /**
     * Getter for <code>public._prisma_migrations.started_at</code>.
     */
    @Override
    public OffsetDateTime getStartedAt() {
        return this.startedAt;
    }

    /**
     * Setter for <code>public._prisma_migrations.started_at</code>.
     */
    @Override
    public void setStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * Getter for <code>public._prisma_migrations.applied_steps_count</code>.
     */
    @Override
    public Integer getAppliedStepsCount() {
        return this.appliedStepsCount;
    }

    /**
     * Setter for <code>public._prisma_migrations.applied_steps_count</code>.
     */
    @Override
    public void setAppliedStepsCount(Integer appliedStepsCount) {
        this.appliedStepsCount = appliedStepsCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final _PrismaMigrations other = (_PrismaMigrations) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.checksum == null) {
            if (other.checksum != null)
                return false;
        }
        else if (!this.checksum.equals(other.checksum))
            return false;
        if (this.finishedAt == null) {
            if (other.finishedAt != null)
                return false;
        }
        else if (!this.finishedAt.equals(other.finishedAt))
            return false;
        if (this.migrationName == null) {
            if (other.migrationName != null)
                return false;
        }
        else if (!this.migrationName.equals(other.migrationName))
            return false;
        if (this.logs == null) {
            if (other.logs != null)
                return false;
        }
        else if (!this.logs.equals(other.logs))
            return false;
        if (this.rolledBackAt == null) {
            if (other.rolledBackAt != null)
                return false;
        }
        else if (!this.rolledBackAt.equals(other.rolledBackAt))
            return false;
        if (this.startedAt == null) {
            if (other.startedAt != null)
                return false;
        }
        else if (!this.startedAt.equals(other.startedAt))
            return false;
        if (this.appliedStepsCount == null) {
            if (other.appliedStepsCount != null)
                return false;
        }
        else if (!this.appliedStepsCount.equals(other.appliedStepsCount))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.checksum == null) ? 0 : this.checksum.hashCode());
        result = prime * result + ((this.finishedAt == null) ? 0 : this.finishedAt.hashCode());
        result = prime * result + ((this.migrationName == null) ? 0 : this.migrationName.hashCode());
        result = prime * result + ((this.logs == null) ? 0 : this.logs.hashCode());
        result = prime * result + ((this.rolledBackAt == null) ? 0 : this.rolledBackAt.hashCode());
        result = prime * result + ((this.startedAt == null) ? 0 : this.startedAt.hashCode());
        result = prime * result + ((this.appliedStepsCount == null) ? 0 : this.appliedStepsCount.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("_PrismaMigrations (");

        sb.append(id);
        sb.append(", ").append(checksum);
        sb.append(", ").append(finishedAt);
        sb.append(", ").append(migrationName);
        sb.append(", ").append(logs);
        sb.append(", ").append(rolledBackAt);
        sb.append(", ").append(startedAt);
        sb.append(", ").append(appliedStepsCount);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(I_PrismaMigrations from) {
        setId(from.getId());
        setChecksum(from.getChecksum());
        setFinishedAt(from.getFinishedAt());
        setMigrationName(from.getMigrationName());
        setLogs(from.getLogs());
        setRolledBackAt(from.getRolledBackAt());
        setStartedAt(from.getStartedAt());
        setAppliedStepsCount(from.getAppliedStepsCount());
    }

    @Override
    public <E extends I_PrismaMigrations> E into(E into) {
        into.from(this);
        return into;
    }
}