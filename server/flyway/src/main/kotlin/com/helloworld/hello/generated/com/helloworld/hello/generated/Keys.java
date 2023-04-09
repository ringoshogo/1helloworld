/*
 * This file is generated by jOOQ.
 */
package com.helloworld.hello.generated;


import com.helloworld.hello.generated.tables.TodoUsers;
import com.helloworld.hello.generated.tables.Users;

import org.jooq.Record;
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

    public static final UniqueKey<Record> TODO_USERS_PKEY = Internal.createUniqueKey(TodoUsers.TODO_USERS, DSL.name("todo_users_pkey"), new TableField[] { TodoUsers.TODO_USERS.ID }, true);
    public static final UniqueKey<Record> USERS_PKEY = Internal.createUniqueKey(Users.USERS, DSL.name("users_pkey"), new TableField[] { Users.USERS.ID }, true);
}
