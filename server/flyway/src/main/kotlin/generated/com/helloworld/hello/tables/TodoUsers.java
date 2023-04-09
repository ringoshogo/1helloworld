/*
 * This file is generated by jOOQ.
 */
package generated.com.helloworld.hello.tables;


import generated.com.helloworld.hello.Keys;
import generated.com.helloworld.hello.Public;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
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
public class TodoUsers extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.todo_users</code>
     */
    public static final TodoUsers TODO_USERS = new TodoUsers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>public.todo_users.id</code>.
     */
    public final TableField<Record, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.todo_users.name</code>.
     */
    public final TableField<Record, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private TodoUsers(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private TodoUsers(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.todo_users</code> table reference
     */
    public TodoUsers(String alias) {
        this(DSL.name(alias), TODO_USERS);
    }

    /**
     * Create an aliased <code>public.todo_users</code> table reference
     */
    public TodoUsers(Name alias) {
        this(alias, TODO_USERS);
    }

    /**
     * Create a <code>public.todo_users</code> table reference
     */
    public TodoUsers() {
        this(DSL.name("todo_users"), null);
    }

    public <O extends Record> TodoUsers(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, TODO_USERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<Record, Integer> getIdentity() {
        return (Identity<Record, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.TODO_USERS_PKEY;
    }

    @Override
    public TodoUsers as(String alias) {
        return new TodoUsers(DSL.name(alias), this);
    }

    @Override
    public TodoUsers as(Name alias) {
        return new TodoUsers(alias, this);
    }

    @Override
    public TodoUsers as(Table<?> alias) {
        return new TodoUsers(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public TodoUsers rename(String name) {
        return new TodoUsers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TodoUsers rename(Name name) {
        return new TodoUsers(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public TodoUsers rename(Table<?> name) {
        return new TodoUsers(name.getQualifiedName(), null);
    }
}
